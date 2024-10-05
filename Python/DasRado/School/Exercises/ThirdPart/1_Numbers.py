total = 0
count = 0

while True:
    entry = input("Enter a number: ")

    if entry.lower() == "end":
        break

    try:
        number = int(entry)
        total += number
        count += 1
    except ValueError:
        print("Invalid input")

if count > 0:
    average = total / count
    print(f"{total} {count} {average}")
else:
    print("No numbers were entered")
