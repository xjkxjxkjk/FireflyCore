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

public final class RankUpAvatarCsReqOuterClass {
  /**
   * Protobuf type {@code RankUpAvatarCsReq}
   */
  public static final class RankUpAvatarCsReq extends ProtoMessage<RankUpAvatarCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 equip_avatar_id = 3;</code>
     */
    private int equipAvatarId;

    /**
     * <code>optional uint32 rank = 13;</code>
     */
    private int rank;

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     */
    private final ItemCostListOuterClass.ItemCostList itemCostList = ItemCostListOuterClass.ItemCostList.newInstance();

    private RankUpAvatarCsReq() {
    }

    /**
     * @return a new empty instance of {@code RankUpAvatarCsReq}
     */
    public static RankUpAvatarCsReq newInstance() {
      return new RankUpAvatarCsReq();
    }

    /**
     * <code>optional uint32 equip_avatar_id = 3;</code>
     * @return whether the equipAvatarId field is set
     */
    public boolean hasEquipAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 3;</code>
     * @return this
     */
    public RankUpAvatarCsReq clearEquipAvatarId() {
      bitField0_ &= ~0x00000001;
      equipAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 3;</code>
     * @return the equipAvatarId
     */
    public int getEquipAvatarId() {
      return equipAvatarId;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 3;</code>
     * @param value the equipAvatarId to set
     * @return this
     */
    public RankUpAvatarCsReq setEquipAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      equipAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 13;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 rank = 13;</code>
     * @return this
     */
    public RankUpAvatarCsReq clearRank() {
      bitField0_ &= ~0x00000002;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 13;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 13;</code>
     * @param value the rank to set
     * @return this
     */
    public RankUpAvatarCsReq setRank(final int value) {
      bitField0_ |= 0x00000002;
      rank = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     * @return whether the itemCostList field is set
     */
    public boolean hasItemCostList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     * @return this
     */
    public RankUpAvatarCsReq clearItemCostList() {
      bitField0_ &= ~0x00000004;
      itemCostList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemCostList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getItemCostList() {
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableItemCostList() {
      bitField0_ |= 0x00000004;
      return itemCostList;
    }

    /**
     * <code>optional .ItemCostList item_cost_list = 5;</code>
     * @param value the itemCostList to set
     * @return this
     */
    public RankUpAvatarCsReq setItemCostList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000004;
      itemCostList.copyFrom(value);
      return this;
    }

    @Override
    public RankUpAvatarCsReq copyFrom(final RankUpAvatarCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        equipAvatarId = other.equipAvatarId;
        rank = other.rank;
        itemCostList.copyFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RankUpAvatarCsReq mergeFrom(final RankUpAvatarCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEquipAvatarId()) {
        setEquipAvatarId(other.equipAvatarId);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasItemCostList()) {
        getMutableItemCostList().mergeFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public RankUpAvatarCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      equipAvatarId = 0;
      rank = 0;
      itemCostList.clear();
      return this;
    }

    @Override
    public RankUpAvatarCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RankUpAvatarCsReq)) {
        return false;
      }
      RankUpAvatarCsReq other = (RankUpAvatarCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEquipAvatarId() || equipAvatarId == other.equipAvatarId)
        && (!hasRank() || rank == other.rank)
        && (!hasItemCostList() || itemCostList.equals(other.itemCostList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(itemCostList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(itemCostList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RankUpAvatarCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // equipAvatarId
            equipAvatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // itemCostList
            input.readMessage(itemCostList);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.equipAvatarId, equipAvatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.itemCostList, itemCostList);
      }
      output.endObject();
    }

    @Override
    public RankUpAvatarCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 169047204:
          case 33057906: {
            if (input.isAtField(FieldNames.equipAvatarId)) {
              if (!input.trySkipNullValue()) {
                equipAvatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 203506238:
          case -1124889692: {
            if (input.isAtField(FieldNames.itemCostList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(itemCostList);
                bitField0_ |= 0x00000004;
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
    public RankUpAvatarCsReq clone() {
      return new RankUpAvatarCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RankUpAvatarCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RankUpAvatarCsReq(), data).checkInitialized();
    }

    public static RankUpAvatarCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RankUpAvatarCsReq(), input).checkInitialized();
    }

    public static RankUpAvatarCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RankUpAvatarCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RankUpAvatarCsReq messages
     */
    public static MessageFactory<RankUpAvatarCsReq> getFactory() {
      return RankUpAvatarCsReqFactory.INSTANCE;
    }

    private enum RankUpAvatarCsReqFactory implements MessageFactory<RankUpAvatarCsReq> {
      INSTANCE;

      @Override
      public RankUpAvatarCsReq create() {
        return RankUpAvatarCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName equipAvatarId = FieldName.forField("equipAvatarId", "equip_avatar_id");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName itemCostList = FieldName.forField("itemCostList", "item_cost_list");
    }
  }
}