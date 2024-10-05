import math

def is_triangular_number(x):
    if x < 0:
        return False

    # Calculate the discriminant
    discriminant = 1 + 8 * x
    # Check if the discriminant is a perfect square
    sqrt_discriminant = math.isqrt(discriminant)
    if sqrt_discriminant * sqrt_discriminant != discriminant:
        return False

    # Calculate the potential triangular number index
    n = (-1 + sqrt_discriminant) // 2
    return n * (n + 1) // 2 == x

# Example usage:
number = 6
if is_triangular_number(number):
    print(f"{number} is a triangular number.")
else:
    print(f"{number} is not a triangular number.")
