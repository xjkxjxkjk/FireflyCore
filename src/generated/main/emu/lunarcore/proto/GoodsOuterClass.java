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

public final class GoodsOuterClass {
  /**
   * Protobuf type {@code Goods}
   */
  public static final class Goods extends ProtoMessage<Goods> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 14;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 15;</code>
     */
    private long endTime;

    /**
     * <code>optional uint32 goods_id = 10;</code>
     */
    private int goodsId;

    /**
     * <code>optional uint32 item_id = 11;</code>
     */
    private int itemId;

    /**
     * <code>optional uint32 buy_times = 13;</code>
     */
    private int buyTimes;

    private Goods() {
    }

    /**
     * @return a new empty instance of {@code Goods}
     */
    public static Goods newInstance() {
      return new Goods();
    }

    /**
     * <code>optional int64 begin_time = 14;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 14;</code>
     * @return this
     */
    public Goods clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 14;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 14;</code>
     * @param value the beginTime to set
     * @return this
     */
    public Goods setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return this
     */
    public Goods clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @param value the endTime to set
     * @return this
     */
    public Goods setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint32 goods_id = 10;</code>
     * @return whether the goodsId field is set
     */
    public boolean hasGoodsId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 goods_id = 10;</code>
     * @return this
     */
    public Goods clearGoodsId() {
      bitField0_ &= ~0x00000004;
      goodsId = 0;
      return this;
    }

    /**
     * <code>optional uint32 goods_id = 10;</code>
     * @return the goodsId
     */
    public int getGoodsId() {
      return goodsId;
    }

    /**
     * <code>optional uint32 goods_id = 10;</code>
     * @param value the goodsId to set
     * @return this
     */
    public Goods setGoodsId(final int value) {
      bitField0_ |= 0x00000004;
      goodsId = value;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 11;</code>
     * @return whether the itemId field is set
     */
    public boolean hasItemId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 item_id = 11;</code>
     * @return this
     */
    public Goods clearItemId() {
      bitField0_ &= ~0x00000008;
      itemId = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 11;</code>
     * @return the itemId
     */
    public int getItemId() {
      return itemId;
    }

    /**
     * <code>optional uint32 item_id = 11;</code>
     * @param value the itemId to set
     * @return this
     */
    public Goods setItemId(final int value) {
      bitField0_ |= 0x00000008;
      itemId = value;
      return this;
    }

    /**
     * <code>optional uint32 buy_times = 13;</code>
     * @return whether the buyTimes field is set
     */
    public boolean hasBuyTimes() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 buy_times = 13;</code>
     * @return this
     */
    public Goods clearBuyTimes() {
      bitField0_ &= ~0x00000010;
      buyTimes = 0;
      return this;
    }

    /**
     * <code>optional uint32 buy_times = 13;</code>
     * @return the buyTimes
     */
    public int getBuyTimes() {
      return buyTimes;
    }

    /**
     * <code>optional uint32 buy_times = 13;</code>
     * @param value the buyTimes to set
     * @return this
     */
    public Goods setBuyTimes(final int value) {
      bitField0_ |= 0x00000010;
      buyTimes = value;
      return this;
    }

    @Override
    public Goods copyFrom(final Goods other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        goodsId = other.goodsId;
        itemId = other.itemId;
        buyTimes = other.buyTimes;
      }
      return this;
    }

    @Override
    public Goods mergeFrom(final Goods other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasGoodsId()) {
        setGoodsId(other.goodsId);
      }
      if (other.hasItemId()) {
        setItemId(other.itemId);
      }
      if (other.hasBuyTimes()) {
        setBuyTimes(other.buyTimes);
      }
      return this;
    }

    @Override
    public Goods clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      goodsId = 0;
      itemId = 0;
      buyTimes = 0;
      return this;
    }

    @Override
    public Goods clearQuick() {
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
      if (!(o instanceof Goods)) {
        return false;
      }
      Goods other = (Goods) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasGoodsId() || goodsId == other.goodsId)
        && (!hasItemId() || itemId == other.itemId)
        && (!hasBuyTimes() || buyTimes == other.buyTimes);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(itemId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(buyTimes);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buyTimes);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Goods mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // goodsId
            goodsId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // itemId
            itemId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // buyTimes
            buyTimes = input.readUInt32();
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
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.goodsId, goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.itemId, itemId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.buyTimes, buyTimes);
      }
      output.endObject();
    }

    @Override
    public Goods mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 207037201:
          case 2123207332: {
            if (input.isAtField(FieldNames.goodsId)) {
              if (!input.trySkipNullValue()) {
                goodsId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1178662002:
          case 2116204999: {
            if (input.isAtField(FieldNames.itemId)) {
              if (!input.trySkipNullValue()) {
                itemId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -994591648:
          case -442602419: {
            if (input.isAtField(FieldNames.buyTimes)) {
              if (!input.trySkipNullValue()) {
                buyTimes = input.readUInt32();
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
    public Goods clone() {
      return new Goods().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Goods parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Goods(), data).checkInitialized();
    }

    public static Goods parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Goods(), input).checkInitialized();
    }

    public static Goods parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Goods(), input).checkInitialized();
    }

    /**
     * @return factory for creating Goods messages
     */
    public static MessageFactory<Goods> getFactory() {
      return GoodsFactory.INSTANCE;
    }

    private enum GoodsFactory implements MessageFactory<Goods> {
      INSTANCE;

      @Override
      public Goods create() {
        return Goods.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName goodsId = FieldName.forField("goodsId", "goods_id");

      static final FieldName itemId = FieldName.forField("itemId", "item_id");

      static final FieldName buyTimes = FieldName.forField("buyTimes", "buy_times");
    }
  }
}
