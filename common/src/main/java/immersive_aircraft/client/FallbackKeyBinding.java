package immersive_aircraft.client;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

import java.util.function.Supplier;

public class FallbackKeyBinding extends KeyBinding {
    public Supplier<KeyBinding> fallbackKey;

    public FallbackKeyBinding(String translationKey, InputUtil.Type type, Supplier<KeyBinding> fallbackKey, String category) {
        super(translationKey, type, InputUtil.UNKNOWN_KEY.getCode(), category);

        this.fallbackKey = fallbackKey;
    }

    @Override
    public boolean isPressed() {
        if (isDefault()) {
            return fallbackKey.get().isPressed();
        } else {
            return super.isPressed();
        }
    }

    @Override
    public boolean wasPressed() {
        if (isDefault()) {
            return fallbackKey.get().wasPressed();
        } else {
            return super.wasPressed();
        }
    }
}
