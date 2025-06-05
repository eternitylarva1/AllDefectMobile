package defectSkinMod;

import com.badlogic.gdx.graphics.Color;
import com.megacrit.cardcrawl.android.mods.BaseMod;
import com.megacrit.cardcrawl.android.mods.interfaces.*;

public class DefectSkinMod implements EditCardsSubscriber
        {
    public static final String MOD_ID = "DefectSkinMod";
    private static final Color YELLOW_COLOR = new Color(0.98F, 0.95F, 0.05F, 1.0F);

    public static void initialize() {
        new DefectSkinMod();
    }

    public DefectSkinMod() {
        BaseMod.subscribe(this);
    }

    public static String makeId(String name) {
        return MOD_ID + ":" + name;
    }


    @Override
    public void receiveEditCards() {

    }
}
