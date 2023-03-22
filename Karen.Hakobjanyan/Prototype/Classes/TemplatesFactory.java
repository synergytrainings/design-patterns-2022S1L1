package Prototype.Classes;

import java.util.HashMap;

public class TemplatesFactory {
    private static HashMap<TemplateType, Template> emptyTemplates = new HashMap<>();
    private static HashMap<String, Template> templates = new HashMap<>();

    public TemplatesFactory() {
        emptyTemplates.put(TemplateType.CardToCardTransfers, new CardToCardTransfer());
        emptyTemplates.put(TemplateType.TransfersInArmenia, new TransferInArmenia());
    }

    public Template getTemplate(TemplateType type) {
        return emptyTemplates.get(type);
    }

    public void saveTemplate(Template template) {
        if (!templates.containsKey(template.getName())) {
            templates.put(template.getName(), template);
        }
    }

    public Template editTemplate(String name) {
        return templates.get(name).clone();
    }
}
