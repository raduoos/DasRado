def calculate_salary(hours, hourly_rate):
    if hours > 40:
        overtime_hours = hours - 40
        salary = (40 * hourly_rate) + (overtime_hours * hourly_rate * 1.5)
    else:
        salary = hours * hourly_rate
    return salary

try:
    hours = float(input("Enter Hours: "))
    hourly_rate = float(input("Enter Hourly Rate: "))

    salary = calculate_salary(hours, hourly_rate)

    print("Salary:", salary)

except ValueError:
    print("Error, please enter a number")
