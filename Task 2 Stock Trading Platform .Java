Task 2: Stock Trading Platform (Java OOP Project)


INTERNSHIP TASK 2

Name :RAUSHAN KUMAR
Internship :CODE ALPHA
DATE :08 JULY 2026

Project Title:
Stock Trading Platform using Java




Project Objective

The main objective of this project is to create a simple stock trading platform where users can buy and sell stocks, view current market prices, and track their investment portfolio. The project demonstrates the concepts of Object-Oriented Programming (OOP) in Java such as classes, objects, inheritance (optional), encapsulation, and abstraction.

Project Description

This application simulates a real stock market environment. It allows users to create an account with a certain amount of balance, purchase available stocks, sell owned stocks, and monitor their portfolio performance.

The system updates the user's balance after every transaction and stores all purchased stocks inside the portfolio.

Although this project is a simulation, it provides a clear understanding of how online trading applications work.

Features
1. Market Data Display

The application displays available stocks with their details.

Example:

Stock	Price
Apple	$180
Google	$150
Tesla	$220
Amazon	$170

The user can view all available stocks before making any purchase.

2. Buy Stocks

The user can purchase stocks if sufficient balance is available.

Example:

Initial Balance:

$5000

User buys

10 Apple Shares
Price = $180

Total Cost

10 × 180 = $1800

Remaining Balance

5000 - 1800 = $3200

The purchased shares are added to the user's portfolio.

3. Sell Stocks

Users can sell previously purchased stocks.

Example

Portfolio

Apple = 10 shares

User sells

5 shares

The application

Removes 5 shares
Adds selling amount to balance
Updates portfolio

4. Portfolio Management

The application maintains a portfolio for every user.

Example

Portfolio

Apple : 5 shares

Tesla : 3 shares

Google : 8 shares

The user can check

Owned stocks
Number of shares
Current portfolio value

5. Portfolio Performance

The system calculates

Portfolio Value

=

Current Stock Price × Number of Shares

Example

Apple

5 × $180 = $900

Tesla

3 × $220 = $660

Google

8 × $150 = $1200

Total Portfolio
$2760

Object-Oriented Programming Concepts Used
1. Stock Class

This class represents a stock available in the market.

Attributes
stockName

stockPrice

stockSymbol
Methods
displayStock()

updatePrice()
2. User Class

Represents the investor.

Attributes
userName

balance

portfolio
Methods
buyStock()

sellStock()

showPortfolio()
3. Portfolio Class

Stores purchased shares.

Attributes
List of Stocks

Quantity
Methods
addStock()

removeStock()

calculateValue()
4. Transaction Class

Stores transaction history.

Attributes
Transaction Type

Stock Name

Quantity

Price

Date
Methods
displayTransaction()
OOP Principles Used
Encapsulation

Private variables protect sensitive data.

Example

private double balance;

Access is provided using getters and setters.

Abstraction

The user interacts with simple options like

Buy Stock

Sell Stock

View Portfolio

The internal calculations remain hidden.

Inheritance (Optional)

Example

Person

↓

User

User inherits common properties from Person.

Polymorphism (Optional)

Different transaction types

Buy Transaction

Sell Transaction

can override a common method like

displayTransaction()
Java Collections Used

Mostly

ArrayList

or

HashMap

Example

HashMap<String, Integer> portfolio;

Stores

Apple → 10

Tesla → 5
Program Flow
Start

↓

Display Market Stocks

↓

User Login

↓

Choose Operation

↓

Buy Stock

OR

Sell Stock

↓

Update Portfolio

↓

Update Balance

↓

Display Portfolio

↓

Exit
Optional File Handling

To save user data permanently,

Java File I/O can be used.

Example files

portfolio.txt

transactions.txt

users.txt

When the application starts,

Read data from file.

When user exits,

Write updated portfolio to file.

This prevents data loss.

Technologies Used
Java
OOP Concepts
ArrayList
HashMap
File Handling (Optional)
Scanner Class
Exception Handling
Learning Outcomes

After completing this project, you will understand:

Object-Oriented Programming in Java
Class and Object creation
Encapsulation and abstraction
Collections Framework
Menu-driven console applications
File handling for data persistence
Basic financial calculations
Real-world stock trading workflow
Sample Console Output
========= STOCK TRADING PLATFORM =========

Available Stocks

1. Apple   $180
2. Tesla   $220
3. Google  $150

Current Balance: $5000

1. Buy Stock
2. Sell Stock
3. View Portfolio
4. Exit

Choose Option: 1

Enter Stock Name:
Apple

Enter Quantity:
10

Stock Purchased Successfully!

Remaining Balance:
$3200

Portfolio

Apple : 10 Shares

Total Portfolio Value:
$1800

Conclusion

This project is a console-based stock trading simulation built using Java and Object-Oriented Programming. It allows users to buy and sell stocks, manage their portfolio, calculate investment value, and maintain transaction records. The project demonstrates practical use of Java classes, collections, encapsulation, abstraction, and optional file handling, making it an excellent beginner-to-intermediate internship project that models the basic functionality of a real stock trading system.