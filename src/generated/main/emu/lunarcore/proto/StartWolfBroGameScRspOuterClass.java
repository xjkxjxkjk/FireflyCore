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

public final class StartWolfBroGameScRspOuterClass {
  /**
   * <pre>
   *  Ddekdbohgob
   * </pre>
   *
   * Protobuf type {@code StartWolfBroGameScRsp}
   */
  public static final class StartWolfBroGameScRsp extends ProtoMessage<StartWolfBroGameScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     */
    private final WolfBroGameDataOuterClass.WolfBroGameData wolfBroGameData = WolfBroGameDataOuterClass.WolfBroGameData.newInstance();

    private StartWolfBroGameScRsp() {
    }

    /**
     * <pre>
     *  Ddekdbohgob
     * </pre>
     *
     * @return a new empty instance of {@code StartWolfBroGameScRsp}
     */
    public static StartWolfBroGameScRsp newInstance() {
      return new StartWolfBroGameScRsp();
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public StartWolfBroGameScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public StartWolfBroGameScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     * @return whether the wolfBroGameData field is set
     */
    public boolean hasWolfBroGameData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     * @return this
     */
    public StartWolfBroGameScRsp clearWolfBroGameData() {
      bitField0_ &= ~0x00000002;
      wolfBroGameData.clear();
      return this;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableWolfBroGameData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public WolfBroGameDataOuterClass.WolfBroGameData getWolfBroGameData() {
      return wolfBroGameData;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public WolfBroGameDataOuterClass.WolfBroGameData getMutableWolfBroGameData() {
      bitField0_ |= 0x00000002;
      return wolfBroGameData;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 1;</code>
     * @param value the wolfBroGameData to set
     * @return this
     */
    public StartWolfBroGameScRsp setWolfBroGameData(
        final WolfBroGameDataOuterClass.WolfBroGameData value) {
      bitField0_ |= 0x00000002;
      wolfBroGameData.copyFrom(value);
      return this;
    }

    @Override
    public StartWolfBroGameScRsp copyFrom(final StartWolfBroGameScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        wolfBroGameData.copyFrom(other.wolfBroGameData);
      }
      return this;
    }

    @Override
    public StartWolfBroGameScRsp mergeFrom(final StartWolfBroGameScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasWolfBroGameData()) {
        getMutableWolfBroGameData().mergeFrom(other.wolfBroGameData);
      }
      return this;
    }

    @Override
    public StartWolfBroGameScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      wolfBroGameData.clear();
      return this;
    }

    @Override
    public StartWolfBroGameScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      wolfBroGameData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartWolfBroGameScRsp)) {
        return false;
      }
      StartWolfBroGameScRsp other = (StartWolfBroGameScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasWolfBroGameData() || wolfBroGameData.equals(other.wolfBroGameData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(wolfBroGameData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(wolfBroGameData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartWolfBroGameScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // wolfBroGameData
            input.readMessage(wolfBroGameData);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.wolfBroGameData, wolfBroGameData);
      }
      output.endObject();
    }

    @Override
    public StartWolfBroGameScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1944966217:
          case 1326367370: {
            if (input.isAtField(FieldNames.wolfBroGameData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(wolfBroGameData);
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
    public StartWolfBroGameScRsp clone() {
      return new StartWolfBroGameScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartWolfBroGameScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartWolfBroGameScRsp(), data).checkInitialized();
    }

    public static StartWolfBroGameScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartWolfBroGameScRsp(), input).checkInitialized();
    }

    public static StartWolfBroGameScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartWolfBroGameScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartWolfBroGameScRsp messages
     */
    public static MessageFactory<StartWolfBroGameScRsp> getFactory() {
      return StartWolfBroGameScRspFactory.INSTANCE;
    }

    private enum StartWolfBroGameScRspFactory implements MessageFactory<StartWolfBroGameScRsp> {
      INSTANCE;

      @Override
      public StartWolfBroGameScRsp create() {
        return StartWolfBroGameScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName wolfBroGameData = FieldName.forField("wolfBroGameData", "wolf_bro_game_data");
    }
  }
}