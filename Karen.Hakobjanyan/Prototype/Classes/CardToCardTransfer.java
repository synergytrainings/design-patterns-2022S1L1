package Prototype.Classes;

public class CardToCardTransfer extends Template{


    public CardToCardTransfer(){
        templateType = TemplateType.CardToCardTransfers;
    }



    @Override
    public void transfer() {
        if(this.getDebitAccount() != null && this.getDebitAccount() != null)
            System.out.println("Card to card transfer is being done");
    }
}
