def wallis_product(n_terms):
    product = 1.0

    for n in range(1, n_terms + 1):
        numerator = 4 * n * n
        denominator = numerator - 1
        product *= numerator / denominator

    pi_approximation = 2 * product

    return pi_approximation

terms = 1000
pi_estimate = wallis_product(terms)
print(f"Approximation of π with {terms} terms: {pi_estimate}")
