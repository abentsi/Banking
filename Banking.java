

/* 
Program name: Banking v2

Description: This is a banking program featuring a checking account, savings account, a SCHWAB account, and transfers between said accounts. Universal options include checking balance, adding a deposit, and withdrawing an amount. Checking account has an additional menu for transactions, allowing user to do transactions such as paying for school fees. Savings account has an additional feature for applying interest. SCHWAB account has an additional menu for buying shares of stocks such as Tesla (all stocks are as of April 26th, 2024). 

Developer: Abraham Ntsi, Javi Castellanos
Date: May 2, 2024
Program version v2.1
 */

import java.util.Scanner;

public class Main {
  // *menu methods*
  // main menu
  public static void displayMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|  Welcome to A&J Banking!  |");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Checking Account      [C]|");
    System.out.println("|- Savings Account       [S]|");
    System.out.println("|- SCHWAB Account        [I]|");
    System.out.println("|- Transfer        		 [T]|");
    System.out.println("|- Quit                  [Q]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // checking account menu
  public static void displayChecMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|     Checking Account      |");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Check Balance         [1]|");
    System.out.println("|- Deposit               [2]|");
    System.out.println("|- Withdraw              [3]|");
    System.out.println("|- Transactions          [4]|");
    System.out.println("|- Back to Main Menu     [5]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // savings account menu
  public static void displaySavMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|      Savings Account      |");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Check Balance         [1]|");
    System.out.println("|- Deposit               [2]|");
    System.out.println("|- Withdraw              [3]|");
    System.out.println("|- Interest              [4]|");
    System.out.println("|- Back to Main Menu     [5]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // schwab account menu
  public static void displaySchwabMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|       SCHWAB Account      |");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Check Balance         [1]|");
    System.out.println("|- Deposit               [2]|");
    System.out.println("|- Withdraw              [3]|");
    System.out.println("|- Buy Shares            [4]|");
    System.out.println("|- Back to Main Menu     [5]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // stocks submenu for schwab menu
  public static void displayStockMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|          Stocks       	|");
    System.out.println("|     April 26th, 2024    	|");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Tesla ($TSLA)        [$T]|");
    System.out.println("|- Microsoft ($MSFT)    [$M]|");
    System.out.println("|- Apple ($AAPL)        [$A]|");
    System.out.println("|- Amazon ($AMZN)       [$Z]|");
    System.out.println("|- Back to SCHWAB Menu  [$B]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // transfer menu
  public static void displayTransferMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|          Transfer      	|");
    System.out.println("|      -      -      -      |");
    System.out.println("|- Checking to Savings	 [1]|");
    System.out.println("|- Savings to Checking	 [2]|");
    System.out.println("|- Savings to SCHWAB     [3]|");
    System.out.println("|- SCHWAB to Savings     [4]|");
    System.out.println("|- Back to Main Menu     [5]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
  }
  // transaction submenu for checking account
  public static void displayTransactionMenu() {
    System.out.println(" ___________________________");
    System.out.println("|  * * * A&J Banking * * *  |");
    System.out.println("|---------------------------|");
    System.out.println("|        Transactions       |");
    System.out.println("|      -      -      -      |");
    System.out.println("|- School Fees ($2,000) [$1]|");
    System.out.println("|- Music ($120)         [$2]|");
    System.out.println("|- Streaming ($160)     [$3]|");
    System.out.println("|- Ghana Trip ($4,000)  [$4]|");
    System.out.println("|- Back to Main Menu    [$5]|");
    System.out.println("|---------------------------|");
    System.out.println("|   ~ Choose an option ~    |");
    System.out.println("|___________________________|");
    System.out.println();
    System.out.println("*         Disclaimer        *");
    System.out.println("          __________         ");
    System.out.println();
    System.out.println(" All transactions will charge");
    System.out.println("your checking account. Please");
    System.out.println(" make any necessary transfers");
    System.out.println("         beforehand.         ");
    System.out.println("*         __________        *");
    System.out.println();
  }
  // main
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String menuOp;                                        // user's menu option
    double checBalance = 0.0;                             // checking account balance
    double savBalance = 0.0;                              // savings account balance
    double schwabBalance = 0.0;                           // schwab account balance
    double withdraw = 0.0;                                // withdraw amount
    double depo = 0.0;                                    // deposit amount
    boolean showMainMenu = false;

    // checking account balance $875, savings account balance $10,000, schwab account $0
    checBalance = 875.00;
    savBalance = 10000.00;
    schwabBalance = 0.00;
    System.out.println();

    // program starts by showing user the main menu
    showMainMenu = true;
    while (showMainMenu) {
      displayMenu();
      menuOp = scnr.next();
      // checking account
      if (menuOp.equals("c") || menuOp.equals("C")) {
        showMainMenu = false;
        while (true) {
          displayChecMenu();
          menuOp = scnr.next();
          // check balance
          if (menuOp.equals("1")) {
            checkBalance(checBalance);
          }
          // deposit
          else if (menuOp.equals("2")) {
            depo = deposit();
            checBalance = addDeposit(depo, checBalance);
          }
          // withdraw
          else if (menuOp.equals("3")) {
            if (checBalance == 0) {
              System.out.println("You don't have any money to withdraw.");
              continue;
            }
            else {
              withdraw = withdraw(checBalance);
              checBalance = doWithdraw(withdraw, checBalance);
            }
          }
          // transaction submenu
          else if (menuOp.equals("4")) {
            while (true) {
              displayTransactionMenu();
              menuOp = scnr.next();
              // pay school fees
              if (menuOp.equals("$1")) {
                transaction("school", checBalance);
                checBalance = checBalance - transactionPrice("school");
                break;
              }
              // pay for annual music subscription
              else if (menuOp.equals("$2")) {
                transaction("music", checBalance);
                checBalance = checBalance - transactionPrice("music");
                break;
              }
              // pay for annual streaming service subscription
              else if (menuOp.equals("$3")) {
                transaction("streaming", checBalance);
                checBalance = checBalance - transactionPrice("streaming");
                break;
              }
              // pay for a trip to ghana
              else if (menuOp.equals("$4")) {
                transaction("ghana", checBalance);
                checBalance = checBalance - transactionPrice("ghana");
                break;
              }
              // return to checking account menu
              else if (menuOp.equals("$5")) {
                break;
              }
            }
          }
          // return to main menu
          else if (menuOp.equals("5")) {
            System.out.println("Returning..");
            showMainMenu = true;
            break;
          }
          // invalid option
          else {
            System.out.println("Not a menu option.");
          }
        }
      }
      // savings account
      else if (menuOp.equals("s") || menuOp.equals("S")) {
        showMainMenu = false;
        while (true) {
          displaySavMenu();
          menuOp = scnr.next();
          // check balance
          if (menuOp.equals("1")) {
            checkBalance(savBalance);
          }
          // deposit
          else if (menuOp.equals("2")) {
            depo = deposit();
            savBalance = addDeposit(depo, savBalance);
          }
          // withdraw
          else if (menuOp.equals("3")) {
            if (savBalance == 0) {
              System.out.println("You don't have any money to withdraw.");
              continue;
            }
            else {
              withdraw = withdraw(savBalance);
              savBalance = doWithdraw(withdraw, savBalance);
            }
          }
          // apply interest to balance (interest rate is 7.5%)
          else if (menuOp.equals("4")) {
            savBalance = applyInterest(savBalance);
          }
          // return to main menu
          else if (menuOp.equals("5")) {
            System.out.println("Returning..");
            showMainMenu = true;
            break;
          }
          // invalid option
          else {
            System.out.println("Not a menu option.");
          }
        }
      }
      // schwab account
      else if (menuOp.equals("i") || menuOp.equals("I")) {
        showMainMenu = false;
        while (true) {
          displaySchwabMenu();
          menuOp = scnr.next();
          // check balance
          if (menuOp.equals("1")) {
            checkBalance(schwabBalance);
          }
          // deposit
          else if (menuOp.equals("2")) {
            depo = deposit();
            schwabBalance = addDeposit(depo, schwabBalance);
          }
          // withdraw
          else if (menuOp.equals("3")) {
            if (schwabBalance == 0) {
              System.out.println("You don't have any money to withdraw.");
              continue;
            }
            else {
              withdraw = withdraw(schwabBalance);
              schwabBalance = doWithdraw(withdraw, savBalance);
            }
          }
          // stocks submenu (all stocks based on april 26th, 2024 of nasdaq)
          else if (menuOp.equals("4")) {
            while (true) {
              displayStockMenu();
              menuOp = scnr.next();
              // tesla stock
              if (menuOp.equals("$T") || menuOp.equals("$t")) {
                buyShares("$TSLA", schwabBalance);
              }
              // microsoft stock
              else if (menuOp.equals("$M") || menuOp.equals("$m")) {
                buyShares("$MSFT", schwabBalance);
              }
              // apple stock
              else if (menuOp.equals("$A") || menuOp.equals("$a")) {
                buyShares("$AAPL", schwabBalance);
              }
              // amazon stock
              else if (menuOp.equals("$Z") || menuOp.equals("$z")) {
                buyShares("$AMZN", schwabBalance);
              }
              // return to schwab menu
              else if (menuOp.equals("$B") || menuOp.equals("$b")) {
                break;
              }
            }
          }
          // return to main menu
          else if (menuOp.equals("5")) {
            System.out.println("Returning..");
            showMainMenu = true;
            break;
          }
          // invalid option
          else {
            System.out.println("Not a menu option.");
          }
        }
      }
      // transfer menu
      else if (menuOp.equals("t") || menuOp.equals("T")) {
        showMainMenu = false;
        while (true) {
          displayTransferMenu();
          menuOp = scnr.next();
          // transfer from checking account to savings account
          if (menuOp.equals("1")) {
            double transferAmt = transfer("chec", "sav", checBalance, savBalance);
            savBalance = doTransfer(transferAmt, checBalance, savBalance);
            checBalance = checBalance - transferAmt;
            System.out.printf("New Checking Account Balance: $%.2f\n", checBalance);
            System.out.printf("New Savings Account Balance: $%.2f\n", savBalance);

          }
          // transfer from savings account to checking account
          else if (menuOp.equals("2")) {
            double transferAmt = transfer("sav", "chec", savBalance, checBalance);
            checBalance = doTransfer(transferAmt, savBalance, checBalance);
            savBalance = savBalance - transferAmt;
            System.out.printf("New Savings Account Balance: $%.2f\n", savBalance);
            System.out.printf("New Checking Account Balance: $%.2f\n", checBalance);

          }
          // transfer from savings account to schwab account (inv stands for investment account, aka schwab)
          else if (menuOp.equals("3")) {
            double transferAmt = transfer("sav", "inv", savBalance, schwabBalance);
            schwabBalance = doTransfer(transferAmt, savBalance, schwabBalance);
            savBalance = savBalance - transferAmt;
            System.out.printf("New Savings Account Balance: $%.2f\n", savBalance);
            System.out.printf("New SCHWAB Account Balance: $%.2f\n", schwabBalance);

          }
          // transfer from schwab account to savings account
          else if (menuOp.equals("4")) {
            double transferAmt = transfer("inv", "sav", schwabBalance, savBalance);
            savBalance = doTransfer(transferAmt, schwabBalance, savBalance);
            schwabBalance = schwabBalance - transferAmt;
            System.out.printf("New SCHWAB Account Balance: $%.2f\n", schwabBalance);
            System.out.printf("New Savings Account Balance: $%.2f\n", savBalance);

          }
          // return to main menu
          else if (menuOp.equals("5")) {
            System.out.println("Returning..");
            showMainMenu = true;
            break;
          }
          // invalid option
          else {
            System.out.println("Not a menu option.");
          }
        }
      }
      // quit program
      else if (menuOp.equals("q") || menuOp.equals("Q")) {
        System.out.println("Quitting..");
        break;
      }
      // invalid option
      else {
        System.out.println("Not a menu option.");
      }
    }
  }

  // check balance method
  public static void checkBalance(double balance) {
    System.out.printf("Available Balance: $%.2f\n", balance);
  }

  // deposit method; takes user input and prompts them for deposit amount. if user inputs invalid amounts, loop will continue until user cancels or inputs a valid amount.
  // returns deposit amount for the addDeposit() method
  public static double deposit() {
    Scanner scnr = new Scanner(System.in);

    while (true) {
      System.out.println("Deposit Amount:");
      double depo = scnr.nextDouble();
      // if deposit is negative, prompt user for new deposit
      while (depo < 0) {
        System.out.println("Invalid amount. Please enter a number greater than $0.");
        System.out.println("Deposit Amount:");
        depo = scnr.nextDouble();
      }
      // if deposit is 0, or isn't a double, cancel
      if (depo == 0) {
        System.out.println("Deposit cancelled");
        break;
      }
      return depo;
    }
    return 0;
  }

  // works with deposit() method; does the math and outputs new balance
  // returns balance
  public static double addDeposit(double depo, double balance) {
    balance = balance + depo;
    System.out.printf("New Balance: $%.2f\n", balance);
    return balance;
  }

  // withdraw method; takes user input and prompts them for withdrawal amount. if user inputs invalid amounts, loop will continue until user cancels or inputs a valid amount.
  // returns withdrawal amount for doWithdraw() method
  public static double withdraw(double balance) {
    Scanner scnr = new Scanner(System.in);

    while (true) {
      System.out.println("Withdraw Amount:");
      double withdrawAmt = scnr.nextDouble();
      // if withdrawal is negative or greater than balance, prompt user for new withdrawal
      while (withdrawAmt < 0 || withdrawAmt > balance) {
        System.out.println("Withdrawing more than your balance or less than $0 is forbidden.");
        System.out.println("Withdraw Amount:");
        withdrawAmt = scnr.nextDouble();
      }
      // if withdrawal is 0, cancel
      if (withdrawAmt == 0) {
        System.out.println("Withdraw cancelled");
        break;
      }
      return withdrawAmt;
    }
    return 0;
  }

  // works with withdraw() method; does the math and outputs new balance
  // returns balance
  public static double doWithdraw(double withdrawAmt, double balance) {
    balance = balance - withdrawAmt;
    System.out.printf("New Balance: $%.2f\n", balance);
    return balance;
  }

  // applies interest rate of 7.5% to balance; does the math and outputs interest applied and new balance
  // returns balance
  public static double applyInterest(double balance) {
    System.out.println("Interest Rate: 7.5%");
    double addedInterest = balance * 0.075;
    balance = balance + addedInterest;
    System.out.print("Interest Applied: +$");
    System.out.printf("%.2f\n", addedInterest);
    System.out.println("...");
    System.out.printf("New Balance: $%.2f\n", balance);
    return balance;
  }

  // buy stock shares method; prompts user for amount of shares they'd like to purchase. if user can't afford the shares, loop continues until they choose a valid amount or cancel.
  // calls doWithdraw() method to handle purchase
  // returns shares for stocksPrice() method
  public static double buyShares(String stock, double balance) {
    Scanner scnr = new Scanner(System.in);

    while (true) {
      System.out.println("How many shares would you like to buy?:");
      int shares = scnr.nextInt();
      double price = stocksPrice(stock, shares);

      // if price of shares is greater than balance, ask user for new amount 
      while (price > balance) {
        System.out.println("You don't have enough money to buy " + shares + " shares. Please enter a new amount.");
        System.out.println("How many shares would you like to buy?:");
        shares = scnr.nextInt();
        price = stocksPrice(stock, shares);
      }
      // if shares is 0 or less, cancel
      if (shares <= 0) {
        System.out.println("Stock purchase cancelled.");
        break;
      }
      // if user only buys one share, print "share of" instead of "shares of"
      if (shares == 1) {
        System.out.print("Successfully purchased " +  shares + " share of " + stock + " for $");
        System.out.printf("%.2f\n", price);
      }
      else {
        System.out.print("Successfully purchased " +  shares + " shares of " + stock + " for $");
        System.out.printf("%.2f\n", price);
      }
      doWithdraw(price, balance);
      return shares;
    }
    return 0;
  }

  // stocks price method; simply stores stock prices for buyShares() method
  // returns price
  public static double stocksPrice(String stock, int shares) {
    double tsla = 168.29;
    double msft = 406.32;
    double aapl = 169.30;
    double amzn = 179.62;
    double price = 0.00;
    if (stock.equals("$TSLA")) {
      price = tsla;
    }
    else if (stock.equals("$MSFT")) {
      price = msft;
    }
    else if (stock.equals("$AAPL")) {
      price = aapl;
    }
    else if (stock.equals("$AMZN")) {
      price = amzn;
    }
    price = shares * price;
    return price;
  }

  // transfer method; prompts user for transfer amount ($5000 is the limit). if user inputs invalid amounts, loop continues until they enter a valid amount or cancel.
  // returns transfer amount for doTransfer() method
  public static double transfer(String acc1, String acc2, double balance1, double balance2) {
    Scanner scnr = new Scanner(System.in);

    while (true) {

      System.out.println("How much would you like to transfer? (Limit $5000)");
      double transferAmt = scnr.nextDouble();
      // if transfer amount is greater than balance, ask user for new amount 
      while (transferAmt > balance1) {
        System.out.println("Transferring more than your account's balance is forbidden. Please enter a new amount.");
        System.out.println("How much would you like to transfer? (Limit $5000)");
        transferAmt = scnr.nextDouble();
      }
      while (transferAmt > 5000) {
        System.out.println("Sorry, transferring more than $5000 is prohibited for security reasons. Please enter a new amount.");
        System.out.println("How much would you like to transfer? (Limit $5000)");
        transferAmt = scnr.nextDouble();
      }
      // if transfer amount is 0, cancel
      if (transferAmt <= 0) {
        System.out.println("Transfer cancelled.");
        break;
      }
      if (acc1.equals("chec") && acc2.equals("sav")) {
        System.out.printf("Successfully transferred $%.2f", transferAmt);
        System.out.println(" from Checking Account to Savings Account.");
      }
      if (acc1.equals("sav") && acc2.equals("chec")) {
        System.out.printf("Successfully transferred $%.2f", transferAmt);
        System.out.println(" from Savings Account to Checking Account.");
      }
      if (acc1.equals("sav") && acc2.equals("inv")) {
        System.out.printf("Successfully transferred $%.2f", transferAmt);
        System.out.println(" from Savings Account to SCHWAB.");
      }
      if (acc1.equals("inv") && acc2.equals("sav")) {
        System.out.printf("Successfully transferred $%.2f", transferAmt);
        System.out.println(" from Savings Account to SCHWAB.");
      }
      return transferAmt;
    }
    return 0;
  }

  // works with transfer() method, does the math
  // returns new balance for the account you transfer to
  public static double doTransfer(double transferAmt, double balance1, double balance2) {
    balance2 = balance2 + transferAmt;
    balance1 = balance1 - transferAmt;
    return balance2;
  }
  // transaction method; outputs transaction failed if you can't afford it, otherwise outputs successful message
  // returns balance
  public static double transaction(String transaction, double balance) {
    Scanner scnr = new Scanner(System.in);

    while (true) {
      double price = transactionPrice(transaction);
      if (price > balance) {
        System.out.println("Transaction failed. You do not have enough money to make this purchase.");
        break;
      }
      if (transaction.equals("school")) {
        System.out.println("Successfully paid for AVC school fees.");

      }
      if (transaction.equals("music")) {
        System.out.println("Successfully paid for a year of your music subscription.");
      }
      if (transaction.equals("streaming")) {
        System.out.println("Successfully paid for a year of your streaming service.");
      }
      if (transaction.equals("ghana")) {
        System.out.println("Successfully paid for a trip to Ghana. Have fun!");
      }
      balance = doWithdraw(price, balance);
      return balance;
    }
    return 0;
  }

  // works with transaction method; simply stores prices for each transaction
  public static double transactionPrice(String transaction) {
    double schoolFees = 2000.00;
    double music = 120.00;
    double streaming = 160.00;
    double ghanaTrip = 4000.00;
    double price = 0.0;

    if (transaction.equals("school")) {
      price = schoolFees;
    }
    else if (transaction.equals("music")) {
      price = music;
    }
    else if (transaction.equals("streaming")) {
      price = streaming;
    }
    else if (transaction.equals("ghana")) {
      price = ghanaTrip;
    }
    return price;
  }
}

