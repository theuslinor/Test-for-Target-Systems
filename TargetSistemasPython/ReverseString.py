def reverseString(inputString):
    charList = list(inputString)
    leftIndex = 0
    rightIndex = len(charList) - 1

    while leftIndex < rightIndex:
        temp = charList[leftIndex]
        charList[leftIndex] = charList[rightIndex]
        charList[rightIndex] = temp

        leftIndex += 1
        rightIndex -= 1

    return ''.join(charList)


inputString = input('Enter the string to reverse: ')
reversedString = reverseString(inputString)
print(reversedString)

