def birth_year(age):
    return 2021-age
if __name__ == '__main__':
    # User enters name
    name = input("What is your name? ")
    # User enters age
    age = int(input("How old are you? "))

    # The year the user was born
    year_born = birth_year(age)

    # print the sentence
    print("Hello", name + "!", "You were born in " + str(year_born) + ".")