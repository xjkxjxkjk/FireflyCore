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

public final class DisplayEquipmentInfoOuterClass {
  /**
   * <pre>
   *  Kgfkeefclbk
   * </pre>
   *
   * Protobuf type {@code DisplayEquipmentInfo}
   */
  public static final class DisplayEquipmentInfo extends ProtoMessage<DisplayEquipmentInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 promotion = 4;</code>
     */
    private int promotion;

    /**
     * <code>optional uint32 level = 8;</code>
     */
    private int level;

    /**
     * <code>optional uint32 rank = 9;</code>
     */
    private int rank;

    /**
     * <code>optional uint32 exp = 10;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 tid = 11;</code>
     */
    private int tid;

    private DisplayEquipmentInfo() {
    }

    /**
     * <pre>
     *  Kgfkeefclbk
     * </pre>
     *
     * @return a new empty instance of {@code DisplayEquipmentInfo}
     */
    public static DisplayEquipmentInfo newInstance() {
      return new DisplayEquipmentInfo();
    }

    /**
     * <code>optional uint32 promotion = 4;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 promotion = 4;</code>
     * @return this
     */
    public DisplayEquipmentInfo clearPromotion() {
      bitField0_ &= ~0x00000001;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 4;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 4;</code>
     * @param value the promotion to set
     * @return this
     */
    public DisplayEquipmentInfo setPromotion(final int value) {
      bitField0_ |= 0x00000001;
      promotion = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return this
     */
    public DisplayEquipmentInfo clearLevel() {
      bitField0_ &= ~0x00000002;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @param value the level to set
     * @return this
     */
    public DisplayEquipmentInfo setLevel(final int value) {
      bitField0_ |= 0x00000002;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 9;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 rank = 9;</code>
     * @return this
     */
    public DisplayEquipmentInfo clearRank() {
      bitField0_ &= ~0x00000004;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 9;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 9;</code>
     * @param value the rank to set
     * @return this
     */
    public DisplayEquipmentInfo setRank(final int value) {
      bitField0_ |= 0x00000004;
      rank = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return this
     */
    public DisplayEquipmentInfo clearExp() {
      bitField0_ &= ~0x00000008;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @param value the exp to set
     * @return this
     */
    public DisplayEquipmentInfo setExp(final int value) {
      bitField0_ |= 0x00000008;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 tid = 11;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 tid = 11;</code>
     * @return this
     */
    public DisplayEquipmentInfo clearTid() {
      bitField0_ &= ~0x00000010;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 11;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 11;</code>
     * @param value the tid to set
     * @return this
     */
    public DisplayEquipmentInfo setTid(final int value) {
      bitField0_ |= 0x00000010;
      tid = value;
      return this;
    }

    @Override
    public DisplayEquipmentInfo copyFrom(final DisplayEquipmentInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        promotion = other.promotion;
        level = other.level;
        rank = other.rank;
        exp = other.exp;
        tid = other.tid;
      }
      return this;
    }

    @Override
    public DisplayEquipmentInfo mergeFrom(final DisplayEquipmentInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      return this;
    }

    @Override
    public DisplayEquipmentInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      promotion = 0;
      level = 0;
      rank = 0;
      exp = 0;
      tid = 0;
      return this;
    }

    @Override
    public DisplayEquipmentInfo clearQuick() {
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
      if (!(o instanceof DisplayEquipmentInfo)) {
        return false;
      }
      DisplayEquipmentInfo other = (DisplayEquipmentInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasPromotion() || promotion == other.promotion)
        && (!hasLevel() || level == other.level)
        && (!hasRank() || rank == other.rank)
        && (!hasExp() || exp == other.exp)
        && (!hasTid() || tid == other.tid);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(tid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DisplayEquipmentInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      output.endObject();
    }

    @Override
    public DisplayEquipmentInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
                bitField0_ |= 0x00000010;
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
    public DisplayEquipmentInfo clone() {
      return new DisplayEquipmentInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DisplayEquipmentInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DisplayEquipmentInfo(), data).checkInitialized();
    }

    public static DisplayEquipmentInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayEquipmentInfo(), input).checkInitialized();
    }

    public static DisplayEquipmentInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayEquipmentInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating DisplayEquipmentInfo messages
     */
    public static MessageFactory<DisplayEquipmentInfo> getFactory() {
      return DisplayEquipmentInfoFactory.INSTANCE;
    }

    private enum DisplayEquipmentInfoFactory implements MessageFactory<DisplayEquipmentInfo> {
      INSTANCE;

      @Override
      public DisplayEquipmentInfo create() {
        return DisplayEquipmentInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName promotion = FieldName.forField("promotion");

      static final FieldName level = FieldName.forField("level");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName tid = FieldName.forField("tid");
    }
  }
}