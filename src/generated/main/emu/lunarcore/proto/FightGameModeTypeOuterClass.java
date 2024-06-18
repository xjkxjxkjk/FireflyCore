// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class FightGameModeTypeOuterClass {
  /**
   * Protobuf enum {@code FightGameModeType}
   */
  public enum FightGameModeType implements ProtoEnum<FightGameModeType> {
    /**
     * <code>FIGHT_GAME_MODE_NONE = 0;</code>
     */
    FIGHT_GAME_MODE_NONE("FIGHT_GAME_MODE_NONE", 0),

    /**
     * <code>FIGHT_GAME_MODE_MATCH3 = 1;</code>
     */
    FIGHT_GAME_MODE_MATCH3("FIGHT_GAME_MODE_MATCH3", 1);

    /**
     * <code>FIGHT_GAME_MODE_NONE = 0;</code>
     */
    public static final int FIGHT_GAME_MODE_NONE_VALUE = 0;

    /**
     * <code>FIGHT_GAME_MODE_MATCH3 = 1;</code>
     */
    public static final int FIGHT_GAME_MODE_MATCH3_VALUE = 1;

    private final String name;

    private final int number;

    private FightGameModeType(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<FightGameModeType> converter() {
      return FightGameModeTypeConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static FightGameModeType forNumber(int value) {
      return FightGameModeTypeConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static FightGameModeType forNumberOr(int number, FightGameModeType other) {
      FightGameModeType value = forNumber(number);
      return value == null ? other : value;
    }

    enum FightGameModeTypeConverter implements ProtoEnum.EnumConverter<FightGameModeType> {
      INSTANCE;

      private static final FightGameModeType[] lookup = new FightGameModeType[2];

      static {
        lookup[0] = FIGHT_GAME_MODE_NONE;
        lookup[1] = FIGHT_GAME_MODE_MATCH3;
      }

      @Override
      public final FightGameModeType forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final FightGameModeType forName(final CharSequence value) {
        if (value.length() == 20) {
          if (ProtoUtil.isEqual("FIGHT_GAME_MODE_NONE", value)) {
            return FIGHT_GAME_MODE_NONE;
          }
        }
        if (value.length() == 22) {
          if (ProtoUtil.isEqual("FIGHT_GAME_MODE_MATCH3", value)) {
            return FIGHT_GAME_MODE_MATCH3;
          }
        }
        return null;
      }
    }
  }
}