package Model;

import Controller.DealerList;
import entity.Account;
import View.Menu;
import View.MenuManagement;
import static View.MenuManagement.dealerManagement;
import static View.MenuManagement.deliveriManagement;
import static View.MenuManagement.accountManagement;
import static View.MenuManagement.inputAccount;
import java.io.IOException;
import tools.MyTool;

public class LogIn {

    private Account acc = null;
    // cóntructor

    public LogIn(Account acc) {
        this.acc = acc;
    }

    public Account getAcc() {
        return acc;
    }

    public static void main(String[] args) throws IOException {
        Account acc = null;
        boolean cont = false;
        boolean valid = false;
        do {
            cont = false;
            AccountChecker accChk = new AccountChecker();
            acc = inputAccount();
            valid = accChk.check(acc);
//            return true false
            if (!valid) {
                cont = MyTool.readBool("Invalid account - Try again?");
            }
            if (!valid && !cont) {
                System.exit(0);
            }
        } while (cont);
        System.out.println("***********Login success***********");
        LogIn logInObj = new LogIn(acc);
        if (acc.getRole().equalsIgnoreCase("ACC-1")) {
            dealerManagement(logInObj);
        } else if (acc.getRole().equalsIgnoreCase("ACC-2")) {
            deliveriManagement(logInObj);
        } else if (acc.getRole().equalsIgnoreCase("BOSS")) {
            accountManagement(logInObj);
        }
    }
}
