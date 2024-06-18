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

public final class GachaItemOuterClass {
  /**
   * <pre>
   *  Afgjlphfbpn
   * </pre>
   *
   * Protobuf type {@code GachaItem}
   */
  public static final class GachaItem extends ProtoMessage<GachaItem> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  cdhekghjjce
     * </pre>
     *
     * <code>optional bool is_new = 10;</code>
     */
    private boolean isNew;

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     */
    private final ItemListOuterClass.ItemList tokenItem = ItemListOuterClass.ItemList.newInstance();

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     */
    private final ItemOuterClass.Item gachaItem = ItemOuterClass.Item.newInstance();

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     */
    private final ItemListOuterClass.ItemList transferItemList = ItemListOuterClass.ItemList.newInstance();

    private GachaItem() {
    }

    /**
     * <pre>
     *  Afgjlphfbpn
     * </pre>
     *
     * @return a new empty instance of {@code GachaItem}
     */
    public static GachaItem newInstance() {
      return new GachaItem();
    }

    /**
     * <pre>
     *  cdhekghjjce
     * </pre>
     *
     * <code>optional bool is_new = 10;</code>
     * @return whether the isNew field is set
     */
    public boolean hasIsNew() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  cdhekghjjce
     * </pre>
     *
     * <code>optional bool is_new = 10;</code>
     * @return this
     */
    public GachaItem clearIsNew() {
      bitField0_ &= ~0x00000001;
      isNew = false;
      return this;
    }

    /**
     * <pre>
     *  cdhekghjjce
     * </pre>
     *
     * <code>optional bool is_new = 10;</code>
     * @return the isNew
     */
    public boolean getIsNew() {
      return isNew;
    }

    /**
     * <pre>
     *  cdhekghjjce
     * </pre>
     *
     * <code>optional bool is_new = 10;</code>
     * @param value the isNew to set
     * @return this
     */
    public GachaItem setIsNew(final boolean value) {
      bitField0_ |= 0x00000001;
      isNew = value;
      return this;
    }

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     * @return whether the tokenItem field is set
     */
    public boolean hasTokenItem() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     * @return this
     */
    public GachaItem clearTokenItem() {
      bitField0_ &= ~0x00000002;
      tokenItem.clear();
      return this;
    }

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTokenItem()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getTokenItem() {
      return tokenItem;
    }

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableTokenItem() {
      bitField0_ |= 0x00000002;
      return tokenItem;
    }

    /**
     * <pre>
     *  fhfenbcnkei
     * </pre>
     *
     * <code>optional .ItemList token_item = 8;</code>
     * @param value the tokenItem to set
     * @return this
     */
    public GachaItem setTokenItem(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000002;
      tokenItem.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     * @return whether the gachaItem field is set
     */
    public boolean hasGachaItem() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     * @return this
     */
    public GachaItem clearGachaItem() {
      bitField0_ &= ~0x00000004;
      gachaItem.clear();
      return this;
    }

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGachaItem()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemOuterClass.Item getGachaItem() {
      return gachaItem;
    }

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemOuterClass.Item getMutableGachaItem() {
      bitField0_ |= 0x00000004;
      return gachaItem;
    }

    /**
     * <pre>
     *  hjghnhljajl
     * </pre>
     *
     * <code>optional .Item gacha_item = 13;</code>
     * @param value the gachaItem to set
     * @return this
     */
    public GachaItem setGachaItem(final ItemOuterClass.Item value) {
      bitField0_ |= 0x00000004;
      gachaItem.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     * @return whether the transferItemList field is set
     */
    public boolean hasTransferItemList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     * @return this
     */
    public GachaItem clearTransferItemList() {
      bitField0_ &= ~0x00000008;
      transferItemList.clear();
      return this;
    }

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTransferItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getTransferItemList() {
      return transferItemList;
    }

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableTransferItemList() {
      bitField0_ |= 0x00000008;
      return transferItemList;
    }

    /**
     * <pre>
     *  eginhhfhbbh
     * </pre>
     *
     * <code>optional .ItemList transfer_item_list = 15;</code>
     * @param value the transferItemList to set
     * @return this
     */
    public GachaItem setTransferItemList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000008;
      transferItemList.copyFrom(value);
      return this;
    }

    @Override
    public GachaItem copyFrom(final GachaItem other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        isNew = other.isNew;
        tokenItem.copyFrom(other.tokenItem);
        gachaItem.copyFrom(other.gachaItem);
        transferItemList.copyFrom(other.transferItemList);
      }
      return this;
    }

    @Override
    public GachaItem mergeFrom(final GachaItem other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIsNew()) {
        setIsNew(other.isNew);
      }
      if (other.hasTokenItem()) {
        getMutableTokenItem().mergeFrom(other.tokenItem);
      }
      if (other.hasGachaItem()) {
        getMutableGachaItem().mergeFrom(other.gachaItem);
      }
      if (other.hasTransferItemList()) {
        getMutableTransferItemList().mergeFrom(other.transferItemList);
      }
      return this;
    }

    @Override
    public GachaItem clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      isNew = false;
      tokenItem.clear();
      gachaItem.clear();
      transferItemList.clear();
      return this;
    }

    @Override
    public GachaItem clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      tokenItem.clearQuick();
      gachaItem.clearQuick();
      transferItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GachaItem)) {
        return false;
      }
      GachaItem other = (GachaItem) o;
      return bitField0_ == other.bitField0_
        && (!hasIsNew() || isNew == other.isNew)
        && (!hasTokenItem() || tokenItem.equals(other.tokenItem))
        && (!hasGachaItem() || gachaItem.equals(other.gachaItem))
        && (!hasTransferItemList() || transferItemList.equals(other.transferItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeBoolNoTag(isNew);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(tokenItem);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(gachaItem);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(transferItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(tokenItem);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(gachaItem);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(transferItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GachaItem mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // isNew
            isNew = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // tokenItem
            input.readMessage(tokenItem);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // gachaItem
            input.readMessage(gachaItem);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // transferItemList
            input.readMessage(transferItemList);
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
        output.writeBool(FieldNames.isNew, isNew);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.tokenItem, tokenItem);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.gachaItem, gachaItem);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.transferItemList, transferItemList);
      }
      output.endObject();
    }

    @Override
    public GachaItem mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100473878:
          case -1179762421: {
            if (input.isAtField(FieldNames.isNew)) {
              if (!input.trySkipNullValue()) {
                isNew = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 141165740:
          case 101174681: {
            if (input.isAtField(FieldNames.tokenItem)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(tokenItem);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 802515893:
          case -871807056: {
            if (input.isAtField(FieldNames.gachaItem)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(gachaItem);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -997597348:
          case 263056118: {
            if (input.isAtField(FieldNames.transferItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(transferItemList);
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
    public GachaItem clone() {
      return new GachaItem().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GachaItem parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GachaItem(), data).checkInitialized();
    }

    public static GachaItem parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaItem(), input).checkInitialized();
    }

    public static GachaItem parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaItem(), input).checkInitialized();
    }

    /**
     * @return factory for creating GachaItem messages
     */
    public static MessageFactory<GachaItem> getFactory() {
      return GachaItemFactory.INSTANCE;
    }

    private enum GachaItemFactory implements MessageFactory<GachaItem> {
      INSTANCE;

      @Override
      public GachaItem create() {
        return GachaItem.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName isNew = FieldName.forField("isNew", "is_new");

      static final FieldName tokenItem = FieldName.forField("tokenItem", "token_item");

      static final FieldName gachaItem = FieldName.forField("gachaItem", "gacha_item");

      static final FieldName transferItemList = FieldName.forField("transferItemList", "transfer_item_list");
    }
  }
}
