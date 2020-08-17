package yor42.animearsenal.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import yor42.animearsenal.gameobject.ItemBase;
import yor42.animearsenal.gameobject.Items.compoundBow;
import yor42.animearsenal.gameobject.Items.toolShield;
import yor42.animearsenal.gameobject.Items.toolSword;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEM_LIST = new ArrayList<Item>();

    public static final Item.ToolMaterial MEGUMIN_WEAPON = EnumHelper.addToolMaterial("megumin_weapon", 0, 15000, 2.0F, 24.0F, 40);
    public static final Item.ToolMaterial YAE_EQUIP = EnumHelper.addToolMaterial("mashu_equip", 0, 15350, 3.0F, 24.0F, 20);
    public static final Item.ToolMaterial HARU_EQUIP = EnumHelper.addToolMaterial("mashu_equip", 0, 15350, 3.0F, 24.0F, 20);

    public static final Item AQUA_FAN = new ItemBase ("aquafan");
    public static final Item EXU_VECTOR = new ItemBase ("exuvector");
    public static final Item SOULUM_SWORD = new toolSword("soulumsword", HARU_EQUIP);
    public static final Item KATANA_THING_IDK_ITS_EN_NAME = new toolSword("katana", YAE_EQUIP);
    public static final Item SHIELD_LORDCHALDEAS = new toolShield("lordchaldeas", CreativeTabs.COMBAT, 1200);
    public static final Item MEGU_STAFF = new toolSword("megustaff", MEGUMIN_WEAPON);
    public static final Item CV6_BOW = new compoundBow("compoundbow").setMaxDamage(1000);
}
