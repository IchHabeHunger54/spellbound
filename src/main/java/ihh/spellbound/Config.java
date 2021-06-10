package ihh.spellbound;

import com.google.common.collect.Lists;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public final class Config {
    static ForgeConfigSpec config;
    private static ForgeConfigSpec.Builder b;
    public static ForgeConfigSpec.IntValue ADVANCE_TIME_USE_DURATION;
    public static ForgeConfigSpec.IntValue ARCHMAGIC_USE_DURATION;
    public static ForgeConfigSpec.IntValue AREA_LIGHTNING_USE_DURATION;
    public static ForgeConfigSpec.IntValue BEDROCK_WALL_USE_DURATION;
    public static ForgeConfigSpec.IntValue BLINK_USE_DURATION;
    public static ForgeConfigSpec.IntValue BREACH_USE_DURATION;
    public static ForgeConfigSpec.IntValue CHANGE_WEATHER_USE_DURATION;
    public static ForgeConfigSpec.IntValue CHAOS_USE_DURATION;
    public static ForgeConfigSpec.IntValue COLD_BLAST_USE_DURATION;
    public static ForgeConfigSpec.IntValue COLD_SHIELD_USE_DURATION;
    public static ForgeConfigSpec.IntValue COLOR_SPRAY_USE_DURATION;
    public static ForgeConfigSpec.IntValue COOKIE_CHEST_USE_DURATION;
    public static ForgeConfigSpec.IntValue DIMENSION_DOOR_USE_DURATION;
    public static ForgeConfigSpec.IntValue DISINTEGRATE_USE_DURATION;
    public static ForgeConfigSpec.IntValue ELEMENTAL_FURY_USE_DURATION;
    public static ForgeConfigSpec.IntValue FIREBALL_USE_DURATION;
    public static ForgeConfigSpec.IntValue FIRE_SHIELD_USE_DURATION;
    public static ForgeConfigSpec.IntValue FISH_FORM_USE_DURATION;
    public static ForgeConfigSpec.IntValue FLAMING_HANDS_USE_DURATION;
    public static ForgeConfigSpec.IntValue FLIGHT_USE_DURATION;
    public static ForgeConfigSpec.IntValue GREATER_FIREBALL_USE_DURATION;
    public static ForgeConfigSpec.IntValue HASTE_USE_DURATION;
    public static ForgeConfigSpec.IntValue ICICLE_USE_DURATION;
    public static ForgeConfigSpec.IntValue ICY_GRIP_USE_DURATION;
    public static ForgeConfigSpec.IntValue INSTANT_LEVITATION_USE_DURATION;
    public static ForgeConfigSpec.IntValue LIGHTNING_BOLT_USE_DURATION;
    public static ForgeConfigSpec.IntValue LIGHTNING_SHIELD_USE_DURATION;
    public static ForgeConfigSpec.IntValue MISCAST_MAGIC_USE_DURATION;
    public static ForgeConfigSpec.IntValue OBSIDIAN_WALL_USE_DURATION;
    public static ForgeConfigSpec.IntValue PANIC_ROOM_USE_DURATION;
    public static ForgeConfigSpec.IntValue PUSH_USE_DURATION;
    public static ForgeConfigSpec.IntValue SPELL_SHIELD_USE_DURATION;
    public static ForgeConfigSpec.IntValue STONE_WALL_USE_DURATION;
    public static ForgeConfigSpec.IntValue SUMMON_SKELETON_USE_DURATION;
    public static ForgeConfigSpec.IntValue SUMMON_WITHER_SKELETON_USE_DURATION;
    public static ForgeConfigSpec.IntValue SUMMON_WOLF_USE_DURATION;
    public static ForgeConfigSpec.IntValue SURGE_SHIELD_USE_DURATION;
    public static ForgeConfigSpec.IntValue TASER_USE_DURATION;
    public static ForgeConfigSpec.IntValue TORCHLIGHT_USE_DURATION;
    public static ForgeConfigSpec.IntValue WAIL_OF_THE_SHE_WOLF_USE_DURATION;
    public static ForgeConfigSpec.IntValue ADVANCE_TIME_MIN;
    public static ForgeConfigSpec.IntValue ADVANCE_TIME_MAX;
    public static ForgeConfigSpec.IntValue ADVANCE_TIME_RANGE;
    public static ForgeConfigSpec.IntValue ARCHMAGIC_DURATION;
    public static ForgeConfigSpec.IntValue AREA_LIGHTNING_HORIZONTAL;
    public static ForgeConfigSpec.IntValue AREA_LIGHTNING_VERTICAL;
    public static ForgeConfigSpec.IntValue AREA_LIGHTNING_DAMAGE;
    public static ForgeConfigSpec.IntValue BLINK_DURATION;
    public static ForgeConfigSpec.IntValue BREACH_RANGE;
    public static ForgeConfigSpec.IntValue CHANGE_WEATHER_DURATION;
    public static ForgeConfigSpec.IntValue CHAOS_DURATION;
    public static ForgeConfigSpec.IntValue COLD_BLAST_RANGE;
    public static ForgeConfigSpec.IntValue COLD_BLAST_HORIZONTAL;
    public static ForgeConfigSpec.IntValue COLD_BLAST_VERTICAL;
    public static ForgeConfigSpec.IntValue COLD_BLAST_DURATION;
    public static ForgeConfigSpec.IntValue COLD_BLAST_DAMAGE;
    public static ForgeConfigSpec.IntValue COLD_SHIELD_DURATION;
    public static ForgeConfigSpec.IntValue COLOR_SPRAY_HORIZONTAL;
    public static ForgeConfigSpec.IntValue COLOR_SPRAY_VERTICAL;
    public static ForgeConfigSpec.IntValue COLOR_SPRAY_DURATION;
    public static ForgeConfigSpec.IntValue DIMENSION_DOOR_MIN;
    public static ForgeConfigSpec.IntValue DIMENSION_DOOR_MAX;
    public static ForgeConfigSpec.IntValue DISINTEGRATE_DURATION;
    public static ForgeConfigSpec.IntValue DISINTEGRATE_DAMAGE;
    public static ForgeConfigSpec.IntValue ELEMENTAL_FURY_HORIZONTAL;
    public static ForgeConfigSpec.IntValue ELEMENTAL_FURY_VERTICAL;
    public static ForgeConfigSpec.IntValue FIREBALL_DAMAGE;
    public static ForgeConfigSpec.IntValue FIRE_SHIELD_DURATION;
    public static ForgeConfigSpec.IntValue FISH_FORM_DURATION;
    public static ForgeConfigSpec.IntValue FLAMING_HANDS_RANGE;
    public static ForgeConfigSpec.IntValue FLIGHT_DURATION;
    public static ForgeConfigSpec.IntValue GREATER_FIREBALL_DAMAGE;
    public static ForgeConfigSpec.IntValue HASTE_DURATION;
    public static ForgeConfigSpec.IntValue ICICLE_RANGE;
    public static ForgeConfigSpec.IntValue ICICLE_HORIZONTAL;
    public static ForgeConfigSpec.IntValue ICICLE_VERTICAL;
    public static ForgeConfigSpec.IntValue ICICLE_DURATION;
    public static ForgeConfigSpec.IntValue ICICLE_DAMAGE;
    public static ForgeConfigSpec.IntValue ICY_GRIP_RANGE;
    public static ForgeConfigSpec.IntValue ICY_GRIP_DURATION;
    public static ForgeConfigSpec.IntValue ICY_GRIP_DAMAGE;
    public static ForgeConfigSpec.IntValue INSTANT_LEVITATION_RANGE;
    public static ForgeConfigSpec.IntValue LIGHTNING_BOLT_DAMAGE;
    public static ForgeConfigSpec.IntValue LIGHTNING_SHIELD_DURATION;
    public static ForgeConfigSpec.IntValue MISCAST_MAGIC_DURATION;
    public static ForgeConfigSpec.IntValue PUSH_HORIZONTAL;
    public static ForgeConfigSpec.IntValue PUSH_VERTICAL;
    public static ForgeConfigSpec.IntValue PUSH_DAMAGE;
    public static ForgeConfigSpec.IntValue PUSH_STRENGTH;
    public static ForgeConfigSpec.IntValue SPELL_SHIELD_DURATION;
    public static ForgeConfigSpec.IntValue SURGE_SHIELD_DURATION;
    public static ForgeConfigSpec.IntValue TASER_DURATION;
    public static ForgeConfigSpec.IntValue TASER_DAMAGE;
    public static ForgeConfigSpec.IntValue WAIL_OF_THE_SHE_WOLF_HORIZONTAL;
    public static ForgeConfigSpec.IntValue WAIL_OF_THE_SHE_WOLF_VERTICAL;
    public static ForgeConfigSpec.IntValue WAIL_OF_THE_SHE_WOLF_DAMAGE;
    public static ForgeConfigSpec.IntValue SURGE_CHANCE;
    public static ForgeConfigSpec.IntValue SURGE_CHAOS_CHANCE;
    public static ForgeConfigSpec.IntValue SURGE_FIRE;
    public static ForgeConfigSpec.BooleanValue SURGE_POTION;
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> SURGE_POTIONS;
    private static final ArrayList<String> SURGE_DEFAULT_POTIONS = Lists.newArrayList("minecraft:weakness;200;0;true;true", "minecraft:poison;200;0;true;true");
    public static ArrayList<EffectInstance> SURGE_EFFECTS = new ArrayList<>();

    static {
        Config.b = new ForgeConfigSpec.Builder();
        b.comment("How long the spells need to be charged, in ticks.");
        push("spell_time");
        ADVANCE_TIME_USE_DURATION = defineTime(b, "advance_time", 1);
        ARCHMAGIC_USE_DURATION = defineTime(b, "archmagic", 5);
        AREA_LIGHTNING_USE_DURATION = defineTime(b, "area_lightning", 3);
        BEDROCK_WALL_USE_DURATION = defineTime(b, "bedrock_wall", 4);
        BLINK_USE_DURATION = defineTime(b, "blink", 3);
        BREACH_USE_DURATION = defineTime(b, "breach", 2);
        CHANGE_WEATHER_USE_DURATION = defineTime(b, "change_weather", 3);
        CHAOS_USE_DURATION = defineTime(b, "chaos", 3);
        COLD_BLAST_USE_DURATION = defineTime(b, "cold_blast", 3);
        COLD_SHIELD_USE_DURATION = defineTime(b, "cold_shield", 1);
        COLOR_SPRAY_USE_DURATION = defineTime(b, "color_spray", 2);
        COOKIE_CHEST_USE_DURATION = defineTime(b, "cookie_chest", 5);
        DIMENSION_DOOR_USE_DURATION = defineTime(b, "dimension_door", 4);
        DISINTEGRATE_USE_DURATION = defineTime(b, "disintegrate", 5);
        ELEMENTAL_FURY_USE_DURATION = defineTime(b, "elemental_fury", 5);
        FIREBALL_USE_DURATION = defineTime(b, "fireball", 2);
        FIRE_SHIELD_USE_DURATION = defineTime(b, "fire_shield", 1);
        FISH_FORM_USE_DURATION = defineTime(b, "fish_form", 3);
        FLAMING_HANDS_USE_DURATION = defineTime(b, "flaming_hands", 1);
        FLIGHT_USE_DURATION = defineTime(b, "flight", 4);
        GREATER_FIREBALL_USE_DURATION = defineTime(b, "greater_fireball", 3);
        HASTE_USE_DURATION = defineTime(b, "haste", 2);
        ICICLE_USE_DURATION = defineTime(b, "icicle", 2);
        ICY_GRIP_USE_DURATION = defineTime(b, "icy_grip", 1);
        INSTANT_LEVITATION_USE_DURATION = defineTime(b, "instant_levitation", 0);
        LIGHTNING_BOLT_USE_DURATION = defineTime(b, "lightning_bolt", 2);
        LIGHTNING_SHIELD_USE_DURATION = defineTime(b, "lightning_shield", 1);
        MISCAST_MAGIC_USE_DURATION = defineTime(b, "miscast_magic", 3);
        OBSIDIAN_WALL_USE_DURATION = defineTime(b, "obsidian_wall", 4);
        PANIC_ROOM_USE_DURATION = defineTime(b, "panic_room", 5);
        PUSH_USE_DURATION = defineTime(b, "push", 1);
        SPELL_SHIELD_USE_DURATION = defineTime(b, "spell_shield", 5);
        STONE_WALL_USE_DURATION = defineTime(b, "stone_wall", 4);
        SUMMON_SKELETON_USE_DURATION = defineTime(b, "summon_skeleton", 2);
        SUMMON_WITHER_SKELETON_USE_DURATION = defineTime(b, "summon_wither_skeleton", 3);
        SUMMON_WOLF_USE_DURATION = defineTime(b, "summon_wolf", 1);
        SURGE_SHIELD_USE_DURATION = defineTime(b, "surge_shield", 1);
        TASER_USE_DURATION = defineTime(b, "taser", 1);
        TORCHLIGHT_USE_DURATION = defineTime(b, "torchlight", 0);
        WAIL_OF_THE_SHE_WOLF_USE_DURATION = defineTime(b, "wail_of_the_she_wolf", 5);
        pop();
        b.comment("Modify the effects of spells.");
        push("spell");
        push("advance_time");
        ADVANCE_TIME_MIN = defineInt("The minimum forward time. Must be lower than max!", "min", 0, 0, 24000);
        ADVANCE_TIME_MAX = defineInt("The maximum forward time. Must be higher than min!", "max", 24000, 0, 24000);
        ADVANCE_TIME_RANGE = defineInt("The range in which plants will grow. Higher values may cause chunkloading issues. Set to 0 to disable.", "range", 32, 0, 256);
        pop();
        push("archmagic");
        ARCHMAGIC_DURATION = defineInt("The duration of the archmagic effect (in ticks).", "duration", 400, 0, 1000000);
        pop();
        push("area_lightning");
        AREA_LIGHTNING_HORIZONTAL = defineInt("The horizontal range.", "horizontal", 32, 0, 256);
        AREA_LIGHTNING_VERTICAL = defineInt("The vertical range.", "vertical", 16, 0, 256);
        AREA_LIGHTNING_DAMAGE = defineInt("The damage.", "damage", 10, 0, Integer.MAX_VALUE);
        pop();
        push("blink");
        BLINK_DURATION = defineInt("The duration of the blink effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("breach");
        BREACH_RANGE = defineInt("The range of the breach effect.", "range", 1, 0, 8);
        pop();
        push("change_weather");
        CHANGE_WEATHER_DURATION = defineInt("How long the changed weather will stay. Similar to /weather clear <duration>", "duration", 1000000, 1, 1000000);
        pop();
        push("chaos");
        CHAOS_DURATION = defineInt("The duration of the chaos effect (in ticks).", "duration", 200, 0, 1000000);
        pop();
        push("cold_blast");
        COLD_BLAST_RANGE = defineInt("The general range.", "range", 14, 4, 16);
        COLD_BLAST_HORIZONTAL = defineInt("The horizontal variance.", "horizontal", 6, 0, 256);
        COLD_BLAST_VERTICAL = defineInt("The vertical variance.", "vertical", 2, 0, 256);
        COLD_BLAST_DURATION = defineInt("The duration of the slowness effect (in ticks).", "duration", 1200, 0, 1000000);
        COLD_BLAST_DAMAGE = defineInt("The damage.", "damage", 10, 0, Integer.MAX_VALUE);
        pop();
        push("cold_shield");
        COLD_SHIELD_DURATION = defineInt("The duration of the cold shield effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("color_spray");
        COLOR_SPRAY_HORIZONTAL = defineInt("The horizontal range.", "horizontal", 6, 0, 256);
        COLOR_SPRAY_VERTICAL = defineInt("The vertical range.", "vertical", 2, 0, 256);
        COLOR_SPRAY_DURATION = defineInt("The duration of the blindness effect (in ticks).", "duration", 200, 0, 1000000);
        pop();
        push("dimension_door");
        DIMENSION_DOOR_MIN = defineInt("The minimum teleport range. Must be lower than max!", "min", 192, 0, 1024);
        DIMENSION_DOOR_MAX = defineInt("The maximum teleport range. Must be higher than min!", "max", 256, 0, 1024);
        pop();
        push("disintegrate");
        DISINTEGRATE_DURATION = defineInt("The duration of the fire (in seconds).", "duration", 10, 0, 1000);
        DISINTEGRATE_DAMAGE = defineInt("The damage.", "damage", 100, 0, Integer.MAX_VALUE);
        pop();
        push("elemental_fury");
        ELEMENTAL_FURY_HORIZONTAL = defineInt("The horizontal range.", "horizontal", 8, 0, 256);
        ELEMENTAL_FURY_VERTICAL = defineInt("The vertical range.", "vertical", 8, 0, 256);
        pop();
        push("fireball");
        FIREBALL_DAMAGE = defineInt("The damage.", "damage", 6, 0, Integer.MAX_VALUE);
        pop();
        push("fire_shield");
        FIRE_SHIELD_DURATION = defineInt("The duration of the cold shield effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("fish_form");
        FISH_FORM_DURATION = defineInt("The duration of the fish form effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("flaming_hands");
        FLAMING_HANDS_RANGE = defineInt("The range.", "range", 3, 0, 64);
        pop();
        push("flight");
        FLIGHT_DURATION = defineInt("The duration of the flight effect (in ticks).", "duration", 400, 0, 1000000);
        pop();
        push("greater_fireball");
        GREATER_FIREBALL_DAMAGE = defineInt("The damage.", "damage", 10, 0, Integer.MAX_VALUE);
        pop();
        push("haste");
        HASTE_DURATION = defineInt("The duration of the haste effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("icicle");
        ICICLE_RANGE = defineInt("The general range.", "range", 14, 4, 16);
        ICICLE_HORIZONTAL = defineInt("The horizontal variance.", "horizontal", 6, 0, 256);
        ICICLE_VERTICAL = defineInt("The vertical variance.", "vertical", 2, 0, 256);
        ICICLE_DURATION = defineInt("The duration of the slowness effect (in ticks).", "duration", 1200, 0, 1000000);
        ICICLE_DAMAGE = defineInt("The damage.", "damage", 6, 0, Integer.MAX_VALUE);
        pop();
        push("icy_grip");
        ICY_GRIP_RANGE = defineInt("The general range.", "range", 3, 0, 64);
        ICY_GRIP_DURATION = defineInt("The duration of the slowness effect (in ticks).", "duration", 1200, 0, 1000000);
        ICY_GRIP_DAMAGE = defineInt("The damage.", "damage", 4, 0, Integer.MAX_VALUE);
        pop();
        push("instant_levitation");
        INSTANT_LEVITATION_RANGE = defineInt("The teleport height.", "range", 4, 0, 255);
        pop();
        push("lightning_bolt");
        LIGHTNING_BOLT_DAMAGE = defineInt("The damage.", "damage", 6, 0, Integer.MAX_VALUE);
        pop();
        push("lightning_shield");
        LIGHTNING_SHIELD_DURATION = defineInt("The duration of the lightning shield effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("miscast_magic");
        MISCAST_MAGIC_DURATION = defineInt("The duration of the miscast magic effect (in ticks).", "duration", 200, 0, 1000000);
        pop();
        push("push");
        PUSH_HORIZONTAL = defineInt("The horizontal range.", "horizontal", 16, 0, 256);
        PUSH_VERTICAL = defineInt("The vertical range.", "vertical", 4, 0, 256);
        PUSH_DAMAGE = defineInt("The damage.", "damage", 0, 0, Integer.MAX_VALUE);
        PUSH_STRENGTH = defineInt("The knockback strength.", "strength", 10, 0, Integer.MAX_VALUE);
        pop();
        push("spell_shield");
        SPELL_SHIELD_DURATION = defineInt("The duration of the spell shield effect (in ticks).", "duration", 400, 0, 1000000);
        pop();
        push("surge_shield");
        SURGE_SHIELD_DURATION = defineInt("The duration of the surge shield effect (in ticks).", "duration", 1200, 0, 1000000);
        pop();
        push("taser");
        TASER_DURATION = defineInt("The duration of the slowness effect (in ticks).", "duration", 1200, 0, 1000000);
        TASER_DAMAGE = defineInt("The damage.", "damage", 4, 0, Integer.MAX_VALUE);
        pop();
        push("wail_of_the_she_wolf");
        WAIL_OF_THE_SHE_WOLF_HORIZONTAL = defineInt("The horizontal range.", "horizontal", 20, 0, 256);
        WAIL_OF_THE_SHE_WOLF_VERTICAL = defineInt("The vertical range.", "vertical", 20, 0, 256);
        WAIL_OF_THE_SHE_WOLF_DAMAGE = defineInt("The damage.", "damage", 100, 0, Integer.MAX_VALUE);
        pop();
        pop();
        push("surge");
        SURGE_CHANCE = b.comment("The chance (1 in X) for surges to occur. Set to 0 to disable surges entirely.").defineInRange("chance", 200, 0, 1000000);
        SURGE_CHAOS_CHANCE = b.comment("The chance (1 in X) for surges to occur when the Chaos potion effect is active. Set to 0 to instead disable surges when Chaos is active").defineInRange("chaos_chance", 2, 0, 1000000);
        SURGE_FIRE = b.comment("How long the fire surge sets you on fire. Set this to 0 to disable.").defineInRange("fire", 10, 0, 1000);
        SURGE_POTION = b.comment("Whether the potion surge is enabled or not.").define("potion", true);
        SURGE_POTIONS = b.comment("List of potion surges. Format is \"registryName;duration;amplifier;showParticles;showIcon\"").defineList("potions", SURGE_DEFAULT_POTIONS, o -> (o instanceof String) && ((String) o).split(";").length >= 2 && ((String) o).split(";").length <= 5);
        pop();
        config = b.build();
    }

    private static void push(String s) {
        b.push(s);
    }

    private static void pop() {
        b.pop();
    }

    private static ForgeConfigSpec.IntValue defineInt(String c, String s, int v, int min, int max) {
        return b.comment(c).defineInRange(s, v, min, max);
    }

    private static ForgeConfigSpec.IntValue defineTime(ForgeConfigSpec.Builder b, String s, int i) {
        return b.defineInRange(s, i, 0, 72000);
    }

    @SubscribeEvent
    public static void reload(ModConfig.ModConfigEvent event) {
        if (event.getConfig().getType() == ModConfig.Type.SERVER) {
            SURGE_EFFECTS.clear();
            SURGE_POTIONS.get().stream().map(s -> s.split(";")).filter(s -> s.length >= 2 && s.length <= 5).forEach(s -> {
                try {
                    ResourceLocation rl = ResourceLocation.tryCreate(s[0]);
                    if (rl == null) return;
                    Effect e = ForgeRegistries.POTIONS.getValue(rl);
                    if (e == null) return;
                    int duration = Integer.parseInt(s[1]);
                    int amplifier = Integer.parseInt(s[2]);
                    int particles = Integer.parseInt(s[3]);
                    int icon = Integer.parseInt(s[4]);
                    SURGE_EFFECTS.add(new EffectInstance(e, duration <= 1 ? 1 : Math.min(duration, 1000000), amplifier <= 0 ? 0 : Math.min(amplifier, 127), particles > 0, icon > 0));
                } catch (Throwable ignored) {
                }
            });
        }
    }
}