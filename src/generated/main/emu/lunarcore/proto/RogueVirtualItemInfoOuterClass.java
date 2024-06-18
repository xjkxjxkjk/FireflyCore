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

public final class RogueVirtualItemInfoOuterClass {
  /**
   * Protobuf type {@code RogueVirtualItemInfo}
   */
  public static final class RogueVirtualItemInfo extends ProtoMessage<RogueVirtualItemInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 JLGAKDGCBOH = 4;</code>
     */
    private int jLGAKDGCBOH;

    /**
     * <code>optional uint32 FGHILCKHDDO = 5;</code>
     */
    private int fGHILCKHDDO;

    /**
     * <code>optional uint32 LGFMKJAOICA = 11;</code>
     */
    private int lGFMKJAOICA;

    /**
     * <code>optional uint32 rogue_coin = 14;</code>
     */
    private int rogueCoin;

    private RogueVirtualItemInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueVirtualItemInfo}
     */
    public static RogueVirtualItemInfo newInstance() {
      return new RogueVirtualItemInfo();
    }

    /**
     * <code>optional uint32 JLGAKDGCBOH = 4;</code>
     * @return whether the jLGAKDGCBOH field is set
     */
    public boolean hasJLGAKDGCBOH() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 JLGAKDGCBOH = 4;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearJLGAKDGCBOH() {
      bitField0_ &= ~0x00000001;
      jLGAKDGCBOH = 0;
      return this;
    }

    /**
     * <code>optional uint32 JLGAKDGCBOH = 4;</code>
     * @return the jLGAKDGCBOH
     */
    public int getJLGAKDGCBOH() {
      return jLGAKDGCBOH;
    }

    /**
     * <code>optional uint32 JLGAKDGCBOH = 4;</code>
     * @param value the jLGAKDGCBOH to set
     * @return this
     */
    public RogueVirtualItemInfo setJLGAKDGCBOH(final int value) {
      bitField0_ |= 0x00000001;
      jLGAKDGCBOH = value;
      return this;
    }

    /**
     * <code>optional uint32 FGHILCKHDDO = 5;</code>
     * @return whether the fGHILCKHDDO field is set
     */
    public boolean hasFGHILCKHDDO() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 FGHILCKHDDO = 5;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearFGHILCKHDDO() {
      bitField0_ &= ~0x00000002;
      fGHILCKHDDO = 0;
      return this;
    }

    /**
     * <code>optional uint32 FGHILCKHDDO = 5;</code>
     * @return the fGHILCKHDDO
     */
    public int getFGHILCKHDDO() {
      return fGHILCKHDDO;
    }

    /**
     * <code>optional uint32 FGHILCKHDDO = 5;</code>
     * @param value the fGHILCKHDDO to set
     * @return this
     */
    public RogueVirtualItemInfo setFGHILCKHDDO(final int value) {
      bitField0_ |= 0x00000002;
      fGHILCKHDDO = value;
      return this;
    }

    /**
     * <code>optional uint32 LGFMKJAOICA = 11;</code>
     * @return whether the lGFMKJAOICA field is set
     */
    public boolean hasLGFMKJAOICA() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 LGFMKJAOICA = 11;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearLGFMKJAOICA() {
      bitField0_ &= ~0x00000004;
      lGFMKJAOICA = 0;
      return this;
    }

    /**
     * <code>optional uint32 LGFMKJAOICA = 11;</code>
     * @return the lGFMKJAOICA
     */
    public int getLGFMKJAOICA() {
      return lGFMKJAOICA;
    }

    /**
     * <code>optional uint32 LGFMKJAOICA = 11;</code>
     * @param value the lGFMKJAOICA to set
     * @return this
     */
    public RogueVirtualItemInfo setLGFMKJAOICA(final int value) {
      bitField0_ |= 0x00000004;
      lGFMKJAOICA = value;
      return this;
    }

    /**
     * <code>optional uint32 rogue_coin = 14;</code>
     * @return whether the rogueCoin field is set
     */
    public boolean hasRogueCoin() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 rogue_coin = 14;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearRogueCoin() {
      bitField0_ &= ~0x00000008;
      rogueCoin = 0;
      return this;
    }

    /**
     * <code>optional uint32 rogue_coin = 14;</code>
     * @return the rogueCoin
     */
    public int getRogueCoin() {
      return rogueCoin;
    }

    /**
     * <code>optional uint32 rogue_coin = 14;</code>
     * @param value the rogueCoin to set
     * @return this
     */
    public RogueVirtualItemInfo setRogueCoin(final int value) {
      bitField0_ |= 0x00000008;
      rogueCoin = value;
      return this;
    }

    @Override
    public RogueVirtualItemInfo copyFrom(final RogueVirtualItemInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        jLGAKDGCBOH = other.jLGAKDGCBOH;
        fGHILCKHDDO = other.fGHILCKHDDO;
        lGFMKJAOICA = other.lGFMKJAOICA;
        rogueCoin = other.rogueCoin;
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final RogueVirtualItemInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasJLGAKDGCBOH()) {
        setJLGAKDGCBOH(other.jLGAKDGCBOH);
      }
      if (other.hasFGHILCKHDDO()) {
        setFGHILCKHDDO(other.fGHILCKHDDO);
      }
      if (other.hasLGFMKJAOICA()) {
        setLGFMKJAOICA(other.lGFMKJAOICA);
      }
      if (other.hasRogueCoin()) {
        setRogueCoin(other.rogueCoin);
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      jLGAKDGCBOH = 0;
      fGHILCKHDDO = 0;
      lGFMKJAOICA = 0;
      rogueCoin = 0;
      return this;
    }

    @Override
    public RogueVirtualItemInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueVirtualItemInfo)) {
        return false;
      }
      RogueVirtualItemInfo other = (RogueVirtualItemInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasJLGAKDGCBOH() || jLGAKDGCBOH == other.jLGAKDGCBOH)
        && (!hasFGHILCKHDDO() || fGHILCKHDDO == other.fGHILCKHDDO)
        && (!hasLGFMKJAOICA() || lGFMKJAOICA == other.lGFMKJAOICA)
        && (!hasRogueCoin() || rogueCoin == other.rogueCoin);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(jLGAKDGCBOH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(fGHILCKHDDO);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(lGFMKJAOICA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(rogueCoin);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(jLGAKDGCBOH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fGHILCKHDDO);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(lGFMKJAOICA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueCoin);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueVirtualItemInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // jLGAKDGCBOH
            jLGAKDGCBOH = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // fGHILCKHDDO
            fGHILCKHDDO = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // lGFMKJAOICA
            lGFMKJAOICA = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // rogueCoin
            rogueCoin = input.readUInt32();
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.jLGAKDGCBOH, jLGAKDGCBOH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.fGHILCKHDDO, fGHILCKHDDO);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.lGFMKJAOICA, lGFMKJAOICA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.rogueCoin, rogueCoin);
      }
      output.endObject();
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 110448746: {
            if (input.isAtField(FieldNames.jLGAKDGCBOH)) {
              if (!input.trySkipNullValue()) {
                jLGAKDGCBOH = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -196267399: {
            if (input.isAtField(FieldNames.fGHILCKHDDO)) {
              if (!input.trySkipNullValue()) {
                fGHILCKHDDO = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1087946824: {
            if (input.isAtField(FieldNames.lGFMKJAOICA)) {
              if (!input.trySkipNullValue()) {
                lGFMKJAOICA = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655631243:
          case -1124761130: {
            if (input.isAtField(FieldNames.rogueCoin)) {
              if (!input.trySkipNullValue()) {
                rogueCoin = input.readUInt32();
                bitField0_ |= 0x00000008;
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
    public RogueVirtualItemInfo clone() {
      return new RogueVirtualItemInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueVirtualItemInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), data).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueVirtualItemInfo messages
     */
    public static MessageFactory<RogueVirtualItemInfo> getFactory() {
      return RogueVirtualItemInfoFactory.INSTANCE;
    }

    private enum RogueVirtualItemInfoFactory implements MessageFactory<RogueVirtualItemInfo> {
      INSTANCE;

      @Override
      public RogueVirtualItemInfo create() {
        return RogueVirtualItemInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName jLGAKDGCBOH = FieldName.forField("JLGAKDGCBOH");

      static final FieldName fGHILCKHDDO = FieldName.forField("FGHILCKHDDO");

      static final FieldName lGFMKJAOICA = FieldName.forField("LGFMKJAOICA");

      static final FieldName rogueCoin = FieldName.forField("rogueCoin", "rogue_coin");
    }
  }
}