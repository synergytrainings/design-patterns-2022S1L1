public class PupUpModel {
    private final String titleMessage;
    private final String noButtonMessage;
    private final  String yesButtonMessage;
    private final Entity parentEntity;
    private final String subCategorySystemName;
    private final String subEntityKey;
    private final SubEntity subEntity;
    private final boolean editMode;
    private final int currentLanguageId;

    public PupUpModel(String titleMessage, String noButtonMessage, String yesButtonMessage, Entity parentEntity, String subCategorySystemName, String subEntityKey, SubEntity subEntity, boolean editMode, int currentLanguageId) {
        this.titleMessage = titleMessage;
        this.noButtonMessage = noButtonMessage;
        this.yesButtonMessage = yesButtonMessage;
        this.parentEntity = parentEntity;
        this.subCategorySystemName = subCategorySystemName;
        this.subEntityKey = subEntityKey;
        this.subEntity = subEntity;
        this.editMode = editMode;
        this.currentLanguageId = currentLanguageId;
    }

    public String getTitleMessage() {
        return titleMessage;
    }

    public String getNoButtonMessage() {
        return noButtonMessage;
    }

    public String getYesButtonMessage() {
        return yesButtonMessage;
    }

    public Entity getParentEntity() {
        return parentEntity;
    }

    public String getSubCategorySystemName() {
        return subCategorySystemName;
    }

    public String getSubEntityKey() {
        return subEntityKey;
    }

    public SubEntity getSubEntity() {
        return subEntity;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public int getCurrentLanguageId() {
        return currentLanguageId;
    }

    public static class PopUpBuilder {
        private String titleMessage;
        private String noButtonMessage;
        private String yesButtonMessage;
        private Entity parentEntity;
        private String subCategorySystemName;
        private String subEntityKey;
        private SubEntity subEntity;
        private boolean editMode;
        private int currentLanguageId;

        public PopUpBuilder setTitleMessage(String titleMessage) {
            this.titleMessage = titleMessage;
            return this;
        }

        public PopUpBuilder setNoButtonMessage(String noButtonMessage) {
            this.noButtonMessage = noButtonMessage;
            return this;
        }

        public PopUpBuilder setYesButtonMessage(String yesButtonMessage) {
            this.yesButtonMessage = yesButtonMessage;
            return this;
        }

        public PopUpBuilder setParentEntity(Entity parentEntity) {
            this.parentEntity = parentEntity;
            return this;
        }

        public PopUpBuilder setSubCategorySystemName(String subCategorySystemName) {
            this.subCategorySystemName = subCategorySystemName;
            return this;
        }

        public PopUpBuilder setSubEntityKey(String subEntityKey) {
            this.subEntityKey = subEntityKey;
            return this;
        }

        public PopUpBuilder setSubEntity(SubEntity subEntity) {
            this.subEntity = subEntity;
            return this;
        }

        public PopUpBuilder setEditMode(boolean editMode) {
            this.editMode = editMode;
            return this;
        }

        public PopUpBuilder setCurrentLanguageId(int currentLanguageId) {
            this.currentLanguageId = currentLanguageId;
            return this;
        }

        public PupUpModel build (){
            return new PupUpModel(this.titleMessage,this.noButtonMessage, this.yesButtonMessage,this.parentEntity, this.subCategorySystemName, this.subEntityKey, this.subEntity, this.editMode, this.currentLanguageId);
        }
    }
}
