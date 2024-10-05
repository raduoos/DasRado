def is_apocalyptic_number(number):
    number_str = str(number)

    return '666' in number_str

test_number = 666123
if is_apocalyptic_number(test_number):
    print(f"{test_number} is an apocalyptic number.")
else:
    print(f"{test_number} is not an apocalyptic number.")