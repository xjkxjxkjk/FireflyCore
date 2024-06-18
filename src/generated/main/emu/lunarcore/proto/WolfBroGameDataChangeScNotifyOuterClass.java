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

public final class WolfBroGameDataChangeScNotifyOuterClass {
  /**
   * <pre>
   *  Opbmfoooacc
   * </pre>
   *
   * Protobuf type {@code WolfBroGameDataChangeScNotify}
   */
  public static final class WolfBroGameDataChangeScNotify extends ProtoMessage<WolfBroGameDataChangeScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
     */
    private final WolfBroGameDataOuterClass.WolfBroGameData wolfBroGameData = WolfBroGameDataOuterClass.WolfBroGameData.newInstance();

    private WolfBroGameDataChangeScNotify() {
    }

    /**
     * <pre>
     *  Opbmfoooacc
     * </pre>
     *
     * @return a new empty instance of {@code WolfBroGameDataChangeScNotify}
     */
    public static WolfBroGameDataChangeScNotify newInstance() {
      return new WolfBroGameDataChangeScNotify();
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
     * @return whether the wolfBroGameData field is set
     */
    public boolean hasWolfBroGameData() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
     * @return this
     */
    public WolfBroGameDataChangeScNotify clearWolfBroGameData() {
      bitField0_ &= ~0x00000001;
      wolfBroGameData.clear();
      return this;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
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
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public WolfBroGameDataOuterClass.WolfBroGameData getMutableWolfBroGameData() {
      bitField0_ |= 0x00000001;
      return wolfBroGameData;
    }

    /**
     * <code>optional .WolfBroGameData wolf_bro_game_data = 7;</code>
     * @param value the wolfBroGameData to set
     * @return this
     */
    public WolfBroGameDataChangeScNotify setWolfBroGameData(
        final WolfBroGameDataOuterClass.WolfBroGameData value) {
      bitField0_ |= 0x00000001;
      wolfBroGameData.copyFrom(value);
      return this;
    }

    @Override
    public WolfBroGameDataChangeScNotify copyFrom(final WolfBroGameDataChangeScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        wolfBroGameData.copyFrom(other.wolfBroGameData);
      }
      return this;
    }

    @Override
    public WolfBroGameDataChangeScNotify mergeFrom(final WolfBroGameDataChangeScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWolfBroGameData()) {
        getMutableWolfBroGameData().mergeFrom(other.wolfBroGameData);
      }
      return this;
    }

    @Override
    public WolfBroGameDataChangeScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      wolfBroGameData.clear();
      return this;
    }

    @Override
    public WolfBroGameDataChangeScNotify clearQuick() {
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
      if (!(o instanceof WolfBroGameDataChangeScNotify)) {
        return false;
      }
      WolfBroGameDataChangeScNotify other = (WolfBroGameDataChangeScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasWolfBroGameData() || wolfBroGameData.equals(other.wolfBroGameData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(wolfBroGameData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(wolfBroGameData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public WolfBroGameDataChangeScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 58: {
            // wolfBroGameData
            input.readMessage(wolfBroGameData);
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
        output.writeMessage(FieldNames.wolfBroGameData, wolfBroGameData);
      }
      output.endObject();
    }

    @Override
    public WolfBroGameDataChangeScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1944966217:
          case 1326367370: {
            if (input.isAtField(FieldNames.wolfBroGameData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(wolfBroGameData);
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
    public WolfBroGameDataChangeScNotify clone() {
      return new WolfBroGameDataChangeScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static WolfBroGameDataChangeScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new WolfBroGameDataChangeScNotify(), data).checkInitialized();
    }

    public static WolfBroGameDataChangeScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new WolfBroGameDataChangeScNotify(), input).checkInitialized();
    }

    public static WolfBroGameDataChangeScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new WolfBroGameDataChangeScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating WolfBroGameDataChangeScNotify messages
     */
    public static MessageFactory<WolfBroGameDataChangeScNotify> getFactory() {
      return WolfBroGameDataChangeScNotifyFactory.INSTANCE;
    }

    private enum WolfBroGameDataChangeScNotifyFactory implements MessageFactory<WolfBroGameDataChangeScNotify> {
      INSTANCE;

      @Override
      public WolfBroGameDataChangeScNotify create() {
        return WolfBroGameDataChangeScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName wolfBroGameData = FieldName.forField("wolfBroGameData", "wolf_bro_game_data");
    }
  }
}
