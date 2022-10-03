package com.example.teachmeskills_homework;

public class CardCredit{
    int accountNumber;
    int currantMoney;
public CardCredit( int accountNumber, int currantMoney) {
    this.accountNumber = accountNumber;
    this.currantMoney = currantMoney;
}


    void plusMoneyOneTheCard(int plus){
        currantMoney+=plus;
    }
    void minusMoneyFromTheCard(int minus){
        currantMoney-=minus;
    }

    void infoAboutAccount(){
        System.out.println("Номер вашего лицевого счета: " + accountNumber + " \n Текущий баланс: "+ currantMoney);
    }


    public static void main(String[] args) {
        CardCredit cardCredit1 = new CardCredit(11111, 1000);
        CardCredit cardCredit2 = new CardCredit(22222, 2000);
        CardCredit cardCredit3 = new CardCredit(33333, 3000);



        cardCredit1.plusMoneyOneTheCard(100);
        cardCredit1.infoAboutAccount();
        cardCredit2.plusMoneyOneTheCard(200);
        cardCredit2.infoAboutAccount();
        cardCredit3.minusMoneyFromTheCard(300);
        cardCredit3.infoAboutAccount();

    }
}
