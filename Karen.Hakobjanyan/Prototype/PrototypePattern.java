package Prototype;

import Prototype.Classes.CardToCardTransfer;
import Prototype.Classes.Template;
import Prototype.Classes.TemplateType;
import Prototype.Classes.TemplatesFactory;

public class PrototypePattern {
    public static void main(String[] args) {
        TemplatesFactory templatesFactory = new TemplatesFactory();

        Template cardToCardTransfer = templatesFactory.getTemplate(TemplateType.CardToCardTransfers);
        cardToCardTransfer.setName("Transfer to wife");
        cardToCardTransfer.setCreditAccount("Credit Account No");
        cardToCardTransfer.setDebitAccount("Debit Account No");
        cardToCardTransfer.transfer();

        templatesFactory.saveTemplate(cardToCardTransfer);

        Template cardToCardTransferCopy = templatesFactory.editTemplate("Transfer to wife");

        cardToCardTransferCopy.setDebitAccount("another account");

        cardToCardTransferCopy.transfer();
        templatesFactory.saveTemplate(cardToCardTransferCopy);
    }
}
