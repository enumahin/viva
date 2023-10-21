
"Get the total number of occurrance"
occurrance = int(input("How many people donated? \n"))

"Initialize Variables to hold the output"
lowest_donation = 0
highest_donation = 0
total = 0

"Loop through for the number of time entered"
for i in range(0, occurrance):
    # Get the amount from user
    new_amount = float(input(f"Person {i + 1}, how much did they donate? \n"))

    # Check the lowest donation at initial stage
    if lowest_donation == 0:
        lowest_donation = new_amount

    # Check the lowest donation continously     
    if new_amount < lowest_donation:
        lowest_donation = new_amount

    # Check the highest donation
    if highest_donation == 0 or new_amount > highest_donation:
        highest_donation = new_amount

    # Add the new amount to total
    # total = total + new_amount
    total += new_amount

    print(f"We received ${new_amount}, the running total is ${total}.")


"Output the results"
print("The lowest amount is ", lowest_donation)
print(f"Lowest amount: ${lowest_donation}")
print(f"Highest amount: ${highest_donation}")
print(f"Total amount: ${total}")
