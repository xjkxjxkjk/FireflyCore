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
import us.hebi.quickbuf.RepeatedInt;

public final class ChallengeBossBuffInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeBossBuffInfo}
   */
  public static final class ChallengeBossBuffInfo extends ProtoMessage<ChallengeBossBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 KAEFAFNNEEK = 9;</code>
     */
    private int kAEFAFNNEEK;

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     */
    private final RepeatedInt buffList = RepeatedInt.newEmptyInstance();

    private ChallengeBossBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeBossBuffInfo}
     */
    public static ChallengeBossBuffInfo newInstance() {
      return new ChallengeBossBuffInfo();
    }

    /**
     * <code>optional uint32 KAEFAFNNEEK = 9;</code>
     * @return whether the kAEFAFNNEEK field is set
     */
    public boolean hasKAEFAFNNEEK() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 KAEFAFNNEEK = 9;</code>
     * @return this
     */
    public ChallengeBossBuffInfo clearKAEFAFNNEEK() {
      bitField0_ &= ~0x00000001;
      kAEFAFNNEEK = 0;
      return this;
    }

    /**
     * <code>optional uint32 KAEFAFNNEEK = 9;</code>
     * @return the kAEFAFNNEEK
     */
    public int getKAEFAFNNEEK() {
      return kAEFAFNNEEK;
    }

    /**
     * <code>optional uint32 KAEFAFNNEEK = 9;</code>
     * @param value the kAEFAFNNEEK to set
     * @return this
     */
    public ChallengeBossBuffInfo setKAEFAFNNEEK(final int value) {
      bitField0_ |= 0x00000001;
      kAEFAFNNEEK = value;
      return this;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     * @return whether the buffList field is set
     */
    public boolean hasBuffList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     * @return this
     */
    public ChallengeBossBuffInfo clearBuffList() {
      bitField0_ &= ~0x00000002;
      buffList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBuffList() {
      return buffList;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBuffList() {
      bitField0_ |= 0x00000002;
      return buffList;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     * @param value the buffList to add
     * @return this
     */
    public ChallengeBossBuffInfo addBuffList(final int value) {
      bitField0_ |= 0x00000002;
      buffList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 buff_list = 10;</code>
     * @param values the buffList to add
     * @return this
     */
    public ChallengeBossBuffInfo addAllBuffList(final int... values) {
      bitField0_ |= 0x00000002;
      buffList.addAll(values);
      return this;
    }

    @Override
    public ChallengeBossBuffInfo copyFrom(final ChallengeBossBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        kAEFAFNNEEK = other.kAEFAFNNEEK;
        buffList.copyFrom(other.buffList);
      }
      return this;
    }

    @Override
    public ChallengeBossBuffInfo mergeFrom(final ChallengeBossBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasKAEFAFNNEEK()) {
        setKAEFAFNNEEK(other.kAEFAFNNEEK);
      }
      if (other.hasBuffList()) {
        getMutableBuffList().addAll(other.buffList);
      }
      return this;
    }

    @Override
    public ChallengeBossBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      kAEFAFNNEEK = 0;
      buffList.clear();
      return this;
    }

    @Override
    public ChallengeBossBuffInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeBossBuffInfo)) {
        return false;
      }
      ChallengeBossBuffInfo other = (ChallengeBossBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasKAEFAFNNEEK() || kAEFAFNNEEK == other.kAEFAFNNEEK)
        && (!hasBuffList() || buffList.equals(other.buffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(kAEFAFNNEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < buffList.length(); i++) {
          output.writeRawByte((byte) 80);
          output.writeUInt32NoTag(buffList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kAEFAFNNEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * buffList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(buffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeBossBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // kAEFAFNNEEK
            kAEFAFNNEEK = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // buffList [packed=true]
            input.readPackedUInt32(buffList, tag);
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
          case 80: {
            // buffList [packed=false]
            tag = input.readRepeatedUInt32(buffList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.kAEFAFNNEEK, kAEFAFNNEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.buffList, buffList);
      }
      output.endObject();
    }

    @Override
    public ChallengeBossBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -301844337: {
            if (input.isAtField(FieldNames.kAEFAFNNEEK)) {
              if (!input.trySkipNullValue()) {
                kAEFAFNNEEK = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1522789487:
          case 55792906: {
            if (input.isAtField(FieldNames.buffList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(buffList);
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
    public ChallengeBossBuffInfo clone() {
      return new ChallengeBossBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeBossBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeBossBuffInfo(), data).checkInitialized();
    }

    public static ChallengeBossBuffInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossBuffInfo(), input).checkInitialized();
    }

    public static ChallengeBossBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeBossBuffInfo messages
     */
    public static MessageFactory<ChallengeBossBuffInfo> getFactory() {
      return ChallengeBossBuffInfoFactory.INSTANCE;
    }

    private enum ChallengeBossBuffInfoFactory implements MessageFactory<ChallengeBossBuffInfo> {
      INSTANCE;

      @Override
      public ChallengeBossBuffInfo create() {
        return ChallengeBossBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName kAEFAFNNEEK = FieldName.forField("KAEFAFNNEEK");

      static final FieldName buffList = FieldName.forField("buffList", "buff_list");
    }
  }
}
