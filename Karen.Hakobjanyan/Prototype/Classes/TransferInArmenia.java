package Prototype.Classes;

public class TransferInArmenia extends Template{


    public TransferInArmenia(){
        templateType = TemplateType.TransfersInArmenia;
    }

    @Override
    public void transfer() {
        if(this.getDebitAccount() != null && this.getCreditAccount() != null)
            System.out.println("Transfer In Armenia is being done");
    }
}
