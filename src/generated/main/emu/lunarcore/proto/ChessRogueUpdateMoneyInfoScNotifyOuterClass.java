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

public final class ChessRogueUpdateMoneyInfoScNotifyOuterClass {
  /**
   * Protobuf type {@code ChessRogueUpdateMoneyInfoScNotify}
   */
  public static final class ChessRogueUpdateMoneyInfoScNotify extends ProtoMessage<ChessRogueUpdateMoneyInfoScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     */
    private final RogueVirtualItemOuterClass.RogueVirtualItem cNKNDNIMFFL = RogueVirtualItemOuterClass.RogueVirtualItem.newInstance();

    private ChessRogueUpdateMoneyInfoScNotify() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueUpdateMoneyInfoScNotify}
     */
    public static ChessRogueUpdateMoneyInfoScNotify newInstance() {
      return new ChessRogueUpdateMoneyInfoScNotify();
    }

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     * @return whether the cNKNDNIMFFL field is set
     */
    public boolean hasCNKNDNIMFFL() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     * @return this
     */
    public ChessRogueUpdateMoneyInfoScNotify clearCNKNDNIMFFL() {
      bitField0_ &= ~0x00000001;
      cNKNDNIMFFL.clear();
      return this;
    }

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCNKNDNIMFFL()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueVirtualItemOuterClass.RogueVirtualItem getCNKNDNIMFFL() {
      return cNKNDNIMFFL;
    }

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueVirtualItemOuterClass.RogueVirtualItem getMutableCNKNDNIMFFL() {
      bitField0_ |= 0x00000001;
      return cNKNDNIMFFL;
    }

    /**
     * <code>optional .RogueVirtualItem CNKNDNIMFFL = 11;</code>
     * @param value the cNKNDNIMFFL to set
     * @return this
     */
    public ChessRogueUpdateMoneyInfoScNotify setCNKNDNIMFFL(
        final RogueVirtualItemOuterClass.RogueVirtualItem value) {
      bitField0_ |= 0x00000001;
      cNKNDNIMFFL.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueUpdateMoneyInfoScNotify copyFrom(
        final ChessRogueUpdateMoneyInfoScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        cNKNDNIMFFL.copyFrom(other.cNKNDNIMFFL);
      }
      return this;
    }

    @Override
    public ChessRogueUpdateMoneyInfoScNotify mergeFrom(
        final ChessRogueUpdateMoneyInfoScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCNKNDNIMFFL()) {
        getMutableCNKNDNIMFFL().mergeFrom(other.cNKNDNIMFFL);
      }
      return this;
    }

    @Override
    public ChessRogueUpdateMoneyInfoScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cNKNDNIMFFL.clear();
      return this;
    }

    @Override
    public ChessRogueUpdateMoneyInfoScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cNKNDNIMFFL.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueUpdateMoneyInfoScNotify)) {
        return false;
      }
      ChessRogueUpdateMoneyInfoScNotify other = (ChessRogueUpdateMoneyInfoScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasCNKNDNIMFFL() || cNKNDNIMFFL.equals(other.cNKNDNIMFFL));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(cNKNDNIMFFL);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(cNKNDNIMFFL);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueUpdateMoneyInfoScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 90: {
            // cNKNDNIMFFL
            input.readMessage(cNKNDNIMFFL);
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
        output.writeMessage(FieldNames.cNKNDNIMFFL, cNKNDNIMFFL);
      }
      output.endObject();
    }

    @Override
    public ChessRogueUpdateMoneyInfoScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 323875536: {
            if (input.isAtField(FieldNames.cNKNDNIMFFL)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(cNKNDNIMFFL);
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
    public ChessRogueUpdateMoneyInfoScNotify clone() {
      return new ChessRogueUpdateMoneyInfoScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueUpdateMoneyInfoScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateMoneyInfoScNotify(), data).checkInitialized();
    }

    public static ChessRogueUpdateMoneyInfoScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateMoneyInfoScNotify(), input).checkInitialized();
    }

    public static ChessRogueUpdateMoneyInfoScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueUpdateMoneyInfoScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueUpdateMoneyInfoScNotify messages
     */
    public static MessageFactory<ChessRogueUpdateMoneyInfoScNotify> getFactory() {
      return ChessRogueUpdateMoneyInfoScNotifyFactory.INSTANCE;
    }

    private enum ChessRogueUpdateMoneyInfoScNotifyFactory implements MessageFactory<ChessRogueUpdateMoneyInfoScNotify> {
      INSTANCE;

      @Override
      public ChessRogueUpdateMoneyInfoScNotify create() {
        return ChessRogueUpdateMoneyInfoScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName cNKNDNIMFFL = FieldName.forField("CNKNDNIMFFL");
    }
  }
}
