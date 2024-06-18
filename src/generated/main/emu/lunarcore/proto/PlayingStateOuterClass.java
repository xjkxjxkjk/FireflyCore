// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class PlayingStateOuterClass {
  /**
   * Protobuf enum {@code PlayingState}
   */
  public enum PlayingState implements ProtoEnum<PlayingState> {
    /**
     * <code>PLAYING_STATE_NONE = 0;</code>
     */
    PLAYING_STATE_NONE("PLAYING_STATE_NONE", 0),

    /**
     * <code>PLAYING_ROGUE_COSMOS = 1;</code>
     */
    PLAYING_ROGUE_COSMOS("PLAYING_ROGUE_COSMOS", 1),

    /**
     * <code>PLAYING_ROGUE_CHESS = 2;</code>
     */
    PLAYING_ROGUE_CHESS("PLAYING_ROGUE_CHESS", 2),

    /**
     * <code>PLAYING_ROGUE_CHESS_NOUS = 3;</code>
     */
    PLAYING_ROGUE_CHESS_NOUS("PLAYING_ROGUE_CHESS_NOUS", 3),

    /**
     * <code>PLAYING_CHALLENGE_MEMORY = 4;</code>
     */
    PLAYING_CHALLENGE_MEMORY("PLAYING_CHALLENGE_MEMORY", 4),

    /**
     * <code>PLAYING_CHALLENGE_STORY = 5;</code>
     */
    PLAYING_CHALLENGE_STORY("PLAYING_CHALLENGE_STORY", 5),

    /**
     * <code>PLAYING_CHALLENGE_BOSS = 6;</code>
     */
    PLAYING_CHALLENGE_BOSS("PLAYING_CHALLENGE_BOSS", 6),

    /**
     * <code>PLAYINGROGUE_TOURN = 7;</code>
     */
    PLAYINGROGUE_TOURN("PLAYINGROGUE_TOURN", 7);

    /**
     * <code>PLAYING_STATE_NONE = 0;</code>
     */
    public static final int PLAYING_STATE_NONE_VALUE = 0;

    /**
     * <code>PLAYING_ROGUE_COSMOS = 1;</code>
     */
    public static final int PLAYING_ROGUE_COSMOS_VALUE = 1;

    /**
     * <code>PLAYING_ROGUE_CHESS = 2;</code>
     */
    public static final int PLAYING_ROGUE_CHESS_VALUE = 2;

    /**
     * <code>PLAYING_ROGUE_CHESS_NOUS = 3;</code>
     */
    public static final int PLAYING_ROGUE_CHESS_NOUS_VALUE = 3;

    /**
     * <code>PLAYING_CHALLENGE_MEMORY = 4;</code>
     */
    public static final int PLAYING_CHALLENGE_MEMORY_VALUE = 4;

    /**
     * <code>PLAYING_CHALLENGE_STORY = 5;</code>
     */
    public static final int PLAYING_CHALLENGE_STORY_VALUE = 5;

    /**
     * <code>PLAYING_CHALLENGE_BOSS = 6;</code>
     */
    public static final int PLAYING_CHALLENGE_BOSS_VALUE = 6;

    /**
     * <code>PLAYINGROGUE_TOURN = 7;</code>
     */
    public static final int PLAYINGROGUE_TOURN_VALUE = 7;

    private final String name;

    private final int number;

    private PlayingState(String name, int number) {
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
    public static ProtoEnum.EnumConverter<PlayingState> converter() {
      return PlayingStateConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static PlayingState forNumber(int value) {
      return PlayingStateConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static PlayingState forNumberOr(int number, PlayingState other) {
      PlayingState value = forNumber(number);
      return value == null ? other : value;
    }

    enum PlayingStateConverter implements ProtoEnum.EnumConverter<PlayingState> {
      INSTANCE;

      private static final PlayingState[] lookup = new PlayingState[8];

      static {
        lookup[0] = PLAYING_STATE_NONE;
        lookup[1] = PLAYING_ROGUE_COSMOS;
        lookup[2] = PLAYING_ROGUE_CHESS;
        lookup[3] = PLAYING_ROGUE_CHESS_NOUS;
        lookup[4] = PLAYING_CHALLENGE_MEMORY;
        lookup[5] = PLAYING_CHALLENGE_STORY;
        lookup[6] = PLAYING_CHALLENGE_BOSS;
        lookup[7] = PLAYINGROGUE_TOURN;
      }

      @Override
      public final PlayingState forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final PlayingState forName(final CharSequence value) {
        switch (value.length()) {
          case 18: {
            if (ProtoUtil.isEqual("PLAYING_STATE_NONE", value)) {
              return PLAYING_STATE_NONE;
            }
            if (ProtoUtil.isEqual("PLAYINGROGUE_TOURN", value)) {
              return PLAYINGROGUE_TOURN;
            }
            break;
          }
          case 19: {
            if (ProtoUtil.isEqual("PLAYING_ROGUE_CHESS", value)) {
              return PLAYING_ROGUE_CHESS;
            }
            break;
          }
          case 20: {
            if (ProtoUtil.isEqual("PLAYING_ROGUE_COSMOS", value)) {
              return PLAYING_ROGUE_COSMOS;
            }
            break;
          }
          case 22: {
            if (ProtoUtil.isEqual("PLAYING_CHALLENGE_BOSS", value)) {
              return PLAYING_CHALLENGE_BOSS;
            }
            break;
          }
          case 23: {
            if (ProtoUtil.isEqual("PLAYING_CHALLENGE_STORY", value)) {
              return PLAYING_CHALLENGE_STORY;
            }
            break;
          }
          case 24: {
            if (ProtoUtil.isEqual("PLAYING_ROGUE_CHESS_NOUS", value)) {
              return PLAYING_ROGUE_CHESS_NOUS;
            }
            if (ProtoUtil.isEqual("PLAYING_CHALLENGE_MEMORY", value)) {
              return PLAYING_CHALLENGE_MEMORY;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}