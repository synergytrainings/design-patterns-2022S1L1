public class ContactPopUpComponent {
    Entity entity;
    SubEntity subEntity;

    public ContactPopUpComponent(Entity entity) {
        this.entity = entity;
    }

    public void edit() {
        //open dialog with according parameters
     /*  dialog.open( new PupUpModel.PopUpBuilder().setCurrentLanguageId(7).
                setEditMode(true).setNoButtonMessage("Cancel").setYesButtonMessage("Ok").
                setParentEntity(this.entity).setSubCategorySystemName("Contact").setSubEntityKey("contact").setTitleMessage("Contact Edit").setSubEntity(this.subEntity));
     */
    }

    public void add() {
      /* dialog.open( new PupUpModel.PopUpBuilder().setCurrentLanguageId(7).
                setEditMode(true).setNoButtonMessage("Cancel").setYesButtonMessage("Ok").
                setParentEntity(this.entity).setSubCategorySystemName("Contact").setSubEntityKey("contact").setTitleMessage("Contact Add").setSubEntity(blankSubEntity));
      */
    }

    public void delete() {

    }
}
