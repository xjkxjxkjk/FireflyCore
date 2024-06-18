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
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class BoardDataSyncOuterClass {
  /**
   * <pre>
   *  Jaofedcebna
   * </pre>
   *
   * Protobuf type {@code BoardDataSync}
   */
  public static final class BoardDataSync extends ProtoMessage<BoardDataSync> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     */
    private final RepeatedMessage<HeadIconOuterClass.HeadIcon> unlockedHeadIconList = RepeatedMessage.newEmptyInstance(HeadIconOuterClass.HeadIcon.getFactory());

    private BoardDataSync() {
    }

    /**
     * <pre>
     *  Jaofedcebna
     * </pre>
     *
     * @return a new empty instance of {@code BoardDataSync}
     */
    public static BoardDataSync newInstance() {
      return new BoardDataSync();
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @return this
     */
    public BoardDataSync clearSignature() {
      bitField0_ &= ~0x00000001;
      signature.clear();
      return this;
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000001;
      return this.signature;
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @param value the signature to set
     * @return this
     */
    public BoardDataSync setSignature(final CharSequence value) {
      bitField0_ |= 0x00000001;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  bool eaneldecgbg = 1;
     * </pre>
     *
     * <code>optional string signature = 12;</code>
     * @param value the signature to set
     * @return this
     */
    public BoardDataSync setSignature(final Utf8String value) {
      bitField0_ |= 0x00000001;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     * @return whether the unlockedHeadIconList field is set
     */
    public boolean hasUnlockedHeadIconList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     * @return this
     */
    public BoardDataSync clearUnlockedHeadIconList() {
      bitField0_ &= ~0x00000002;
      unlockedHeadIconList.clear();
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedHeadIconList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<HeadIconOuterClass.HeadIcon> getUnlockedHeadIconList() {
      return unlockedHeadIconList;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<HeadIconOuterClass.HeadIcon> getMutableUnlockedHeadIconList() {
      bitField0_ |= 0x00000002;
      return unlockedHeadIconList;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     * @param value the unlockedHeadIconList to add
     * @return this
     */
    public BoardDataSync addUnlockedHeadIconList(final HeadIconOuterClass.HeadIcon value) {
      bitField0_ |= 0x00000002;
      unlockedHeadIconList.add(value);
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>repeated .HeadIcon unlocked_head_icon_list = 13;</code>
     * @param values the unlockedHeadIconList to add
     * @return this
     */
    public BoardDataSync addAllUnlockedHeadIconList(final HeadIconOuterClass.HeadIcon... values) {
      bitField0_ |= 0x00000002;
      unlockedHeadIconList.addAll(values);
      return this;
    }

    @Override
    public BoardDataSync copyFrom(final BoardDataSync other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        signature.copyFrom(other.signature);
        unlockedHeadIconList.copyFrom(other.unlockedHeadIconList);
      }
      return this;
    }

    @Override
    public BoardDataSync mergeFrom(final BoardDataSync other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      if (other.hasUnlockedHeadIconList()) {
        getMutableUnlockedHeadIconList().addAll(other.unlockedHeadIconList);
      }
      return this;
    }

    @Override
    public BoardDataSync clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      unlockedHeadIconList.clear();
      return this;
    }

    @Override
    public BoardDataSync clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      unlockedHeadIconList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BoardDataSync)) {
        return false;
      }
      BoardDataSync other = (BoardDataSync) o;
      return bitField0_ == other.bitField0_
        && (!hasSignature() || signature.equals(other.signature))
        && (!hasUnlockedHeadIconList() || unlockedHeadIconList.equals(other.unlockedHeadIconList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 98);
        output.writeStringNoTag(signature);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < unlockedHeadIconList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(unlockedHeadIconList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * unlockedHeadIconList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(unlockedHeadIconList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BoardDataSync mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 98: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // unlockedHeadIconList
            tag = input.readRepeatedMessage(unlockedHeadIconList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeString(FieldNames.signature, signature);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.unlockedHeadIconList, unlockedHeadIconList);
      }
      output.endObject();
    }

    @Override
    public BoardDataSync mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1875382586:
          case -1276395039: {
            if (input.isAtField(FieldNames.unlockedHeadIconList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(unlockedHeadIconList);
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
    public BoardDataSync clone() {
      return new BoardDataSync().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BoardDataSync parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BoardDataSync(), data).checkInitialized();
    }

    public static BoardDataSync parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BoardDataSync(), input).checkInitialized();
    }

    public static BoardDataSync parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BoardDataSync(), input).checkInitialized();
    }

    /**
     * @return factory for creating BoardDataSync messages
     */
    public static MessageFactory<BoardDataSync> getFactory() {
      return BoardDataSyncFactory.INSTANCE;
    }

    private enum BoardDataSyncFactory implements MessageFactory<BoardDataSync> {
      INSTANCE;

      @Override
      public BoardDataSync create() {
        return BoardDataSync.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName signature = FieldName.forField("signature");

      static final FieldName unlockedHeadIconList = FieldName.forField("unlockedHeadIconList", "unlocked_head_icon_list");
    }
  }
}
