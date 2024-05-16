package net.glasslauncher.example.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.client.Keybind;
import net.modificationstation.stationapi.api.client.event.option.KeyBindingRegisterEvent;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class KeyBindingListener {

    public static Keybind keyBinding;
    public static Keybind keyBinding2;
    public static Keybind keyBinding3;

    @EventListener
    public void registerKeyBindings(KeyBindingRegisterEvent event) {
        List<Keybind> list = event.keyBindings;
        list.add(keyBinding = new Keybind("key.examplemod.test", Keyboard.KEY_Y));
        list.add(keyBinding2 = new Keybind("key.examplemod.test2", Keyboard.KEY_U));
        list.add(keyBinding3 = new Keybind("key.examplemod.hurtme", Keyboard.KEY_I));
    }
}
