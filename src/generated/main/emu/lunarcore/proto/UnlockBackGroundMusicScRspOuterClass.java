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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class UnlockBackGroundMusicScRspOuterClass {
  /**
   * <pre>
   *  Kjabnfancgf
   * </pre>
   *
   * Protobuf type {@code UnlockBackGroundMusicScRsp}
   */
  public static final class UnlockBackGroundMusicScRsp extends ProtoMessage<UnlockBackGroundMusicScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     */
    private final RepeatedInt unlockedIds = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     */
    private final RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> musicList = RepeatedMessage.newEmptyInstance(UnlockedMusicOuterClass.UnlockedMusic.getFactory());

    private UnlockBackGroundMusicScRsp() {
    }

    /**
     * <pre>
     *  Kjabnfancgf
     * </pre>
     *
     * @return a new empty instance of {@code UnlockBackGroundMusicScRsp}
     */
    public static UnlockBackGroundMusicScRsp newInstance() {
      return new UnlockBackGroundMusicScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public UnlockBackGroundMusicScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     * @return whether the unlockedIds field is set
     */
    public boolean hasUnlockedIds() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearUnlockedIds() {
      bitField0_ &= ~0x00000002;
      unlockedIds.clear();
      return this;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedIds()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnlockedIds() {
      return unlockedIds;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnlockedIds() {
      bitField0_ |= 0x00000002;
      return unlockedIds;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     * @param value the unlockedIds to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addUnlockedIds(final int value) {
      bitField0_ |= 0x00000002;
      unlockedIds.add(value);
      return this;
    }

    /**
     * <pre>
     *  maafemkldll
     * </pre>
     *
     * <code>repeated uint32 unlocked_ids = 14;</code>
     * @param values the unlockedIds to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addAllUnlockedIds(final int... values) {
      bitField0_ |= 0x00000002;
      unlockedIds.addAll(values);
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     * @return whether the musicList field is set
     */
    public boolean hasMusicList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearMusicList() {
      bitField0_ &= ~0x00000004;
      musicList.clear();
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMusicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> getMusicList() {
      return musicList;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> getMutableMusicList() {
      bitField0_ |= 0x00000004;
      return musicList;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     * @param value the musicList to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addMusicList(
        final UnlockedMusicOuterClass.UnlockedMusic value) {
      bitField0_ |= 0x00000004;
      musicList.add(value);
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 15;</code>
     * @param values the musicList to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addAllMusicList(
        final UnlockedMusicOuterClass.UnlockedMusic... values) {
      bitField0_ |= 0x00000004;
      musicList.addAll(values);
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp copyFrom(final UnlockBackGroundMusicScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        unlockedIds.copyFrom(other.unlockedIds);
        musicList.copyFrom(other.musicList);
      }
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp mergeFrom(final UnlockBackGroundMusicScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasUnlockedIds()) {
        getMutableUnlockedIds().addAll(other.unlockedIds);
      }
      if (other.hasMusicList()) {
        getMutableMusicList().addAll(other.musicList);
      }
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      unlockedIds.clear();
      musicList.clear();
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockedIds.clear();
      musicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UnlockBackGroundMusicScRsp)) {
        return false;
      }
      UnlockBackGroundMusicScRsp other = (UnlockBackGroundMusicScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasUnlockedIds() || unlockedIds.equals(other.unlockedIds))
        && (!hasMusicList() || musicList.equals(other.musicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < unlockedIds.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(unlockedIds.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < musicList.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(musicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * unlockedIds.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unlockedIds);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * musicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(musicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockBackGroundMusicScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // unlockedIds [packed=true]
            input.readPackedUInt32(unlockedIds, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // musicList
            tag = input.readRepeatedMessage(musicList, tag);
            bitField0_ |= 0x00000004;
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
          case 112: {
            // unlockedIds [packed=false]
            tag = input.readRepeatedUInt32(unlockedIds, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedUInt32(FieldNames.unlockedIds, unlockedIds);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.musicList, musicList);
      }
      output.endObject();
    }

    @Override
    public UnlockBackGroundMusicScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -856496939:
          case -780941476: {
            if (input.isAtField(FieldNames.unlockedIds)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unlockedIds);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 389904483:
          case -780236168: {
            if (input.isAtField(FieldNames.musicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(musicList);
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
    public UnlockBackGroundMusicScRsp clone() {
      return new UnlockBackGroundMusicScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), data).checkInitialized();
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), input).checkInitialized();
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockBackGroundMusicScRsp messages
     */
    public static MessageFactory<UnlockBackGroundMusicScRsp> getFactory() {
      return UnlockBackGroundMusicScRspFactory.INSTANCE;
    }

    private enum UnlockBackGroundMusicScRspFactory implements MessageFactory<UnlockBackGroundMusicScRsp> {
      INSTANCE;

      @Override
      public UnlockBackGroundMusicScRsp create() {
        return UnlockBackGroundMusicScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName unlockedIds = FieldName.forField("unlockedIds", "unlocked_ids");

      static final FieldName musicList = FieldName.forField("musicList", "music_list");
    }
  }
}
