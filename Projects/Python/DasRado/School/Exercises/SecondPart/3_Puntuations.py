def get_grade(score):
    if score >= 0.9:
        return 'excellent'
    elif score >= 0.8:
        return 'good'
    elif score >= 0.7:
        return 'fair'
    elif score >= 0.6:
        return 'pass'
    else:
        return 'fail'

while True:
    input_str = input("Enter score: ")
    try:
        score = float(input_str)
        if 0.0 <= score <= 1.0:
            print(get_grade(score))
        else:
            print("Invalid score")
    except ValueError:
        print("Invalid score")
