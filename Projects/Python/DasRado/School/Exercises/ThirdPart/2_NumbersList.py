def get_numbers():
    numbers = []
    while True:
        entry = input("Enter a number (or leave blank to finish): ")
        if entry == "":
            break
        try:
            number = float(entry)
            numbers.append(number)
        except ValueError:
            print("Please enter a valid number.")
    return numbers


def main():
    numbers = get_numbers()

    if numbers:
        maximum = max(numbers)
        minimum = min(numbers)
        print(f"The maximum number is: {maximum}")
        print(f"The minimum number is: {minimum}")
    else:
        print("No numbers were entered.")


if __name__ == "__main__":
    main()
