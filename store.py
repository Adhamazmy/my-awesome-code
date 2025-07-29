def display_menu():
    print("1. item1 - $10")
    print("2. item2 - $20")
    print("3. item3 - $30")

def get_price(item):
    if item == 1:
        return 10
    elif item == 2:
        return 20
    elif item == 3:
        return 30
    else:
        return None

# عرض القائمة
display_menu()

# إدخال اختيار المستخدم
item = int(input("Choose item (1-3): "))
price = get_price(item)

if price is None:
    print("Invalid option")
else:
    amount = int(input("Enter amount: "))
    if amount < price:
        print("Not enough")
    elif amount == price:
        print("Perfect")
    else:
        the_rest = amount - price
        print("The rest =", the_rest)
