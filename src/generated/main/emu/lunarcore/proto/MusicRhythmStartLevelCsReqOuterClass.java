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

public final class MusicRhythmStartLevelCsReqOuterClass {
  /**
   * Protobuf type {@code MusicRhythmStartLevelCsReq}
   */
  public static final class MusicRhythmStartLevelCsReq extends ProtoMessage<MusicRhythmStartLevelCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 music_id = 3;</code>
     */
    private int musicId;

    private MusicRhythmStartLevelCsReq() {
    }

    /**
     * @return a new empty instance of {@code MusicRhythmStartLevelCsReq}
     */
    public static MusicRhythmStartLevelCsReq newInstance() {
      return new MusicRhythmStartLevelCsReq();
    }

    /**
     * <code>optional uint32 music_id = 3;</code>
     * @return whether the musicId field is set
     */
    public boolean hasMusicId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 music_id = 3;</code>
     * @return this
     */
    public MusicRhythmStartLevelCsReq clearMusicId() {
      bitField0_ &= ~0x00000001;
      musicId = 0;
      return this;
    }

    /**
     * <code>optional uint32 music_id = 3;</code>
     * @return the musicId
     */
    public int getMusicId() {
      return musicId;
    }

    /**
     * <code>optional uint32 music_id = 3;</code>
     * @param value the musicId to set
     * @return this
     */
    public MusicRhythmStartLevelCsReq setMusicId(final int value) {
      bitField0_ |= 0x00000001;
      musicId = value;
      return this;
    }

    @Override
    public MusicRhythmStartLevelCsReq copyFrom(final MusicRhythmStartLevelCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        musicId = other.musicId;
      }
      return this;
    }

    @Override
    public MusicRhythmStartLevelCsReq mergeFrom(final MusicRhythmStartLevelCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMusicId()) {
        setMusicId(other.musicId);
      }
      return this;
    }

    @Override
    public MusicRhythmStartLevelCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      musicId = 0;
      return this;
    }

    @Override
    public MusicRhythmStartLevelCsReq clearQuick() {
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
      if (!(o instanceof MusicRhythmStartLevelCsReq)) {
        return false;
      }
      MusicRhythmStartLevelCsReq other = (MusicRhythmStartLevelCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMusicId() || musicId == other.musicId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(musicId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(musicId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MusicRhythmStartLevelCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // musicId
            musicId = input.readUInt32();
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
        output.writeUInt32(FieldNames.musicId, musicId);
      }
      output.endObject();
    }

    @Override
    public MusicRhythmStartLevelCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1412694560:
          case 843879797: {
            if (input.isAtField(FieldNames.musicId)) {
              if (!input.trySkipNullValue()) {
                musicId = input.readUInt32();
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
    public MusicRhythmStartLevelCsReq clone() {
      return new MusicRhythmStartLevelCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MusicRhythmStartLevelCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MusicRhythmStartLevelCsReq(), data).checkInitialized();
    }

    public static MusicRhythmStartLevelCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MusicRhythmStartLevelCsReq(), input).checkInitialized();
    }

    public static MusicRhythmStartLevelCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MusicRhythmStartLevelCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating MusicRhythmStartLevelCsReq messages
     */
    public static MessageFactory<MusicRhythmStartLevelCsReq> getFactory() {
      return MusicRhythmStartLevelCsReqFactory.INSTANCE;
    }

    private enum MusicRhythmStartLevelCsReqFactory implements MessageFactory<MusicRhythmStartLevelCsReq> {
      INSTANCE;

      @Override
      public MusicRhythmStartLevelCsReq create() {
        return MusicRhythmStartLevelCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName musicId = FieldName.forField("musicId", "music_id");
    }
  }
}