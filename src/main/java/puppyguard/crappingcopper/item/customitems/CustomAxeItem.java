package puppyguard.crappingcopper.item.customitems;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

//Literally only exists because the tool's constructor is protected.
public class CustomAxeItem extends AxeItem {
    public CustomAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
