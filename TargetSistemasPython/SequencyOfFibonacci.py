
def isFibonacci(numberToCheck):
    a = 0
    b = 1

    while a < numberToCheck:
        next = a + b
        a = b
        b = next

        if a == numberToCheck:
            return True

    return False

numberToCheck = int(input("Enter the initial number of the Fibonnaci sequence: "))

if isFibonacci(numberToCheck):
    print(f"The number {numberToCheck} belong to teh Fibonacci sequence.")

else:
    print(f"The number {numberToCheck} does not belong to teh Fibonacci sequence.")