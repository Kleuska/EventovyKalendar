package Builder;

import ChatUtils.ChatUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {

    public final ItemStack item;

    public ItemBuilder(final Material itemType) {
        item = new ItemStack(itemType);
    }
    public ItemBuilder(final ItemStack itemStack) {
        item = itemStack;
    }

    public ItemBuilder amount(final int number) {
        item.setAmount(number);
        return this;
    }

    public ItemBuilder name(final String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatUtils.format(name));
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder lore(final List<String> lore) {
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder customModelData(final int cusModDat) {
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(cusModDat);
        item.setItemMeta(meta);
        return this;
    }

    public ItemStack make() {
        return item;
    }
}
