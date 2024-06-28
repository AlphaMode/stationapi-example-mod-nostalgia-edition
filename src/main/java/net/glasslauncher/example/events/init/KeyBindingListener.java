package net.glasslauncher.example.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.client.KeyMapping;
import net.modificationstation.stationapi.api.client.event.option.KeyBindingRegisterEvent;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class KeyBindingListener {

    public static KeyMapping keyBinding;
    public static KeyMapping keyBinding2;
    public static KeyMapping keyBinding3;

    @EventListener
    public void registerKeyBindings(KeyBindingRegisterEvent event) {
        List<KeyMapping> list = event.keyBindings;
        list.add(keyBinding = new KeyMapping("key.examplemod.test", Keyboard.KEY_Y));
        list.add(keyBinding2 = new KeyMapping("key.examplemod.test2", Keyboard.KEY_U));
        list.add(keyBinding3 = new KeyMapping("key.examplemod.hurtme", Keyboard.KEY_I));
    }
}
