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

public final class ChallengeBossExtraInfoOuterClass {
  /**
   * <pre>
   *  LMJLNMPCJJA
   * </pre>
   *
   * Protobuf type {@code ChallengeBossExtraInfo}
   */
  public static final class ChallengeBossExtraInfo extends ProtoMessage<ChallengeBossExtraInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     */
    private final ChallengeBossInfoOuterClass.ChallengeBossInfo bossBuffInfo = ChallengeBossInfoOuterClass.ChallengeBossInfo.newInstance();

    private ChallengeBossExtraInfo() {
    }

    /**
     * <pre>
     *  LMJLNMPCJJA
     * </pre>
     *
     * @return a new empty instance of {@code ChallengeBossExtraInfo}
     */
    public static ChallengeBossExtraInfo newInstance() {
      return new ChallengeBossExtraInfo();
    }

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     * @return whether the bossBuffInfo field is set
     */
    public boolean hasBossBuffInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     * @return this
     */
    public ChallengeBossExtraInfo clearBossBuffInfo() {
      bitField0_ &= ~0x00000001;
      bossBuffInfo.clear();
      return this;
    }

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBossBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeBossInfoOuterClass.ChallengeBossInfo getBossBuffInfo() {
      return bossBuffInfo;
    }

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeBossInfoOuterClass.ChallengeBossInfo getMutableBossBuffInfo() {
      bitField0_ |= 0x00000001;
      return bossBuffInfo;
    }

    /**
     * <pre>
     *  PIPLIDBCCPA
     * </pre>
     *
     * <code>optional .ChallengeBossInfo boss_buff_info = 11;</code>
     * @param value the bossBuffInfo to set
     * @return this
     */
    public ChallengeBossExtraInfo setBossBuffInfo(
        final ChallengeBossInfoOuterClass.ChallengeBossInfo value) {
      bitField0_ |= 0x00000001;
      bossBuffInfo.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeBossExtraInfo copyFrom(final ChallengeBossExtraInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        bossBuffInfo.copyFrom(other.bossBuffInfo);
      }
      return this;
    }

    @Override
    public ChallengeBossExtraInfo mergeFrom(final ChallengeBossExtraInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBossBuffInfo()) {
        getMutableBossBuffInfo().mergeFrom(other.bossBuffInfo);
      }
      return this;
    }

    @Override
    public ChallengeBossExtraInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bossBuffInfo.clear();
      return this;
    }

    @Override
    public ChallengeBossExtraInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bossBuffInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeBossExtraInfo)) {
        return false;
      }
      ChallengeBossExtraInfo other = (ChallengeBossExtraInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBossBuffInfo() || bossBuffInfo.equals(other.bossBuffInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(bossBuffInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(bossBuffInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeBossExtraInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 90: {
            // bossBuffInfo
            input.readMessage(bossBuffInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.bossBuffInfo, bossBuffInfo);
      }
      output.endObject();
    }

    @Override
    public ChallengeBossExtraInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2114213330:
          case -472671544: {
            if (input.isAtField(FieldNames.bossBuffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(bossBuffInfo);
                bitField0_ |= 0x00000001;
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
    public ChallengeBossExtraInfo clone() {
      return new ChallengeBossExtraInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeBossExtraInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeBossExtraInfo(), data).checkInitialized();
    }

    public static ChallengeBossExtraInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossExtraInfo(), input).checkInitialized();
    }

    public static ChallengeBossExtraInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossExtraInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeBossExtraInfo messages
     */
    public static MessageFactory<ChallengeBossExtraInfo> getFactory() {
      return ChallengeBossExtraInfoFactory.INSTANCE;
    }

    private enum ChallengeBossExtraInfoFactory implements MessageFactory<ChallengeBossExtraInfo> {
      INSTANCE;

      @Override
      public ChallengeBossExtraInfo create() {
        return ChallengeBossExtraInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName bossBuffInfo = FieldName.forField("bossBuffInfo", "boss_buff_info");
    }
  }
}
