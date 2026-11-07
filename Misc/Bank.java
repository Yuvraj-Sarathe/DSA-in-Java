//TODO: Design a bank system supporting transfer/deposit/withdraw with balance validation - LeetCode 2408
// Time: O(1) per operation
// Space: O(n) - balance array of n accounts

public class Bank {
    private long[] balance;
    private int n;

    public Bank(long[] balance) {
        this.balance = balance;
        this.n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!isValid(account1) || !isValid(account2) || balance[account1 - 1] < money) {
            return false;
        }
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!isValid(account)) {
            return false;
        }
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!isValid(account) || balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }

    private boolean isValid(int account) {
        return account >= 1 && account <= n;
    }
}
