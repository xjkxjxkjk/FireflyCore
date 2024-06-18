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

public final class BattleEventInitedDataOuterClass {
  /**
   * <pre>
   *  Fmaobdmmcjb
   * </pre>
   *
   * Protobuf type {@code BattleEventInitedData}
   */
  public static final class BattleEventInitedData extends ProtoMessage<BattleEventInitedData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     */
    private final SpBarInfoOuterClass.SpBarInfo spBar = SpBarInfoOuterClass.SpBarInfo.newInstance();

    private BattleEventInitedData() {
    }

    /**
     * <pre>
     *  Fmaobdmmcjb
     * </pre>
     *
     * @return a new empty instance of {@code BattleEventInitedData}
     */
    public static BattleEventInitedData newInstance() {
      return new BattleEventInitedData();
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @return whether the spBar field is set
     */
    public boolean hasSpBar() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @return this
     */
    public BattleEventInitedData clearSpBar() {
      bitField0_ &= ~0x00000001;
      spBar.clear();
      return this;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSpBar()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SpBarInfoOuterClass.SpBarInfo getSpBar() {
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SpBarInfoOuterClass.SpBarInfo getMutableSpBar() {
      bitField0_ |= 0x00000001;
      return spBar;
    }

    /**
     * <code>optional .SpBarInfo sp_bar = 2;</code>
     * @param value the spBar to set
     * @return this
     */
    public BattleEventInitedData setSpBar(final SpBarInfoOuterClass.SpBarInfo value) {
      bitField0_ |= 0x00000001;
      spBar.copyFrom(value);
      return this;
    }

    @Override
    public BattleEventInitedData copyFrom(final BattleEventInitedData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        spBar.copyFrom(other.spBar);
      }
      return this;
    }

    @Override
    public BattleEventInitedData mergeFrom(final BattleEventInitedData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSpBar()) {
        getMutableSpBar().mergeFrom(other.spBar);
      }
      return this;
    }

    @Override
    public BattleEventInitedData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      spBar.clear();
      return this;
    }

    @Override
    public BattleEventInitedData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      spBar.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BattleEventInitedData)) {
        return false;
      }
      BattleEventInitedData other = (BattleEventInitedData) o;
      return bitField0_ == other.bitField0_
        && (!hasSpBar() || spBar.equals(other.spBar));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(spBar);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(spBar);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BattleEventInitedData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // spBar
            input.readMessage(spBar);
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
        output.writeMessage(FieldNames.spBar, spBar);
      }
      output.endObject();
    }

    @Override
    public BattleEventInitedData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109608054:
          case -896253135: {
            if (input.isAtField(FieldNames.spBar)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(spBar);
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
    public BattleEventInitedData clone() {
      return new BattleEventInitedData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BattleEventInitedData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BattleEventInitedData(), data).checkInitialized();
    }

    public static BattleEventInitedData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleEventInitedData(), input).checkInitialized();
    }

    public static BattleEventInitedData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleEventInitedData(), input).checkInitialized();
    }

    /**
     * @return factory for creating BattleEventInitedData messages
     */
    public static MessageFactory<BattleEventInitedData> getFactory() {
      return BattleEventInitedDataFactory.INSTANCE;
    }

    private enum BattleEventInitedDataFactory implements MessageFactory<BattleEventInitedData> {
      INSTANCE;

      @Override
      public BattleEventInitedData create() {
        return BattleEventInitedData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName spBar = FieldName.forField("spBar", "sp_bar");
    }
  }
}
