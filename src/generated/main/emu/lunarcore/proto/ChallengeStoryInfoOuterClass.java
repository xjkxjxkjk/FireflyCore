// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChallengeStoryInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeStoryInfo}
   */
  public static final class ChallengeStoryInfo extends ProtoMessage<ChallengeStoryInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     */
    private final ChallengeBossBuffInfoOuterClass.ChallengeBossBuffInfo curBossBuffs = ChallengeBossBuffInfoOuterClass.ChallengeBossBuffInfo.newInstance();

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     */
    private final ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo curStoryBuffs = ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo.newInstance();

    private ChallengeStoryInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeStoryInfo}
     */
    public static ChallengeStoryInfo newInstance() {
      return new ChallengeStoryInfo();
    }

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     * @return whether the curBossBuffs field is set
     */
    public boolean hasCurBossBuffs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     * @return this
     */
    public ChallengeStoryInfo clearCurBossBuffs() {
      bitField0_ &= ~0x00000001;
      curBossBuffs.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurBossBuffs()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeBossBuffInfoOuterClass.ChallengeBossBuffInfo getCurBossBuffs() {
      return curBossBuffs;
    }

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeBossBuffInfoOuterClass.ChallengeBossBuffInfo getMutableCurBossBuffs() {
      bitField0_ |= 0x00000001;
      return curBossBuffs;
    }

    /**
     * <code>optional .ChallengeBossBuffInfo cur_boss_buffs = 8;</code>
     * @param value the curBossBuffs to set
     * @return this
     */
    public ChallengeStoryInfo setCurBossBuffs(
        final ChallengeBossBuffInfoOuterClass.ChallengeBossBuffInfo value) {
      bitField0_ |= 0x00000001;
      curBossBuffs.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     * @return whether the curStoryBuffs field is set
     */
    public boolean hasCurStoryBuffs() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     * @return this
     */
    public ChallengeStoryInfo clearCurStoryBuffs() {
      bitField0_ &= ~0x00000002;
      curStoryBuffs.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurStoryBuffs()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo getCurStoryBuffs() {
      return curStoryBuffs;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo getMutableCurStoryBuffs() {
      bitField0_ |= 0x00000002;
      return curStoryBuffs;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 9;</code>
     * @param value the curStoryBuffs to set
     * @return this
     */
    public ChallengeStoryInfo setCurStoryBuffs(
        final ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo value) {
      bitField0_ |= 0x00000002;
      curStoryBuffs.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeStoryInfo copyFrom(final ChallengeStoryInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curBossBuffs.copyFrom(other.curBossBuffs);
        curStoryBuffs.copyFrom(other.curStoryBuffs);
      }
      return this;
    }

    @Override
    public ChallengeStoryInfo mergeFrom(final ChallengeStoryInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurBossBuffs()) {
        getMutableCurBossBuffs().mergeFrom(other.curBossBuffs);
      }
      if (other.hasCurStoryBuffs()) {
        getMutableCurStoryBuffs().mergeFrom(other.curStoryBuffs);
      }
      return this;
    }

    @Override
    public ChallengeStoryInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curBossBuffs.clear();
      curStoryBuffs.clear();
      return this;
    }

    @Override
    public ChallengeStoryInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curBossBuffs.clearQuick();
      curStoryBuffs.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeStoryInfo)) {
        return false;
      }
      ChallengeStoryInfo other = (ChallengeStoryInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasCurBossBuffs() || curBossBuffs.equals(other.curBossBuffs))
        && (!hasCurStoryBuffs() || curStoryBuffs.equals(other.curStoryBuffs));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(curBossBuffs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(curStoryBuffs);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(curBossBuffs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(curStoryBuffs);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeStoryInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 66: {
            // curBossBuffs
            input.readMessage(curBossBuffs);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // curStoryBuffs
            input.readMessage(curStoryBuffs);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.curBossBuffs, curBossBuffs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.curStoryBuffs, curStoryBuffs);
      }
      output.endObject();
    }

    @Override
    public ChallengeStoryInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1632186189:
          case -340377971: {
            if (input.isAtField(FieldNames.curBossBuffs)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(curBossBuffs);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -587091733:
          case -738440393: {
            if (input.isAtField(FieldNames.curStoryBuffs)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(curStoryBuffs);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChallengeStoryInfo clone() {
      return new ChallengeStoryInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeStoryInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), data).checkInitialized();
    }

    public static ChallengeStoryInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), input).checkInitialized();
    }

    public static ChallengeStoryInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeStoryInfo messages
     */
    public static MessageFactory<ChallengeStoryInfo> getFactory() {
      return ChallengeStoryInfoFactory.INSTANCE;
    }

    private enum ChallengeStoryInfoFactory implements MessageFactory<ChallengeStoryInfo> {
      INSTANCE;

      @Override
      public ChallengeStoryInfo create() {
        return ChallengeStoryInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curBossBuffs = FieldName.forField("curBossBuffs", "cur_boss_buffs");

      static final FieldName curStoryBuffs = FieldName.forField("curStoryBuffs", "cur_story_buffs");
    }
  }
}
