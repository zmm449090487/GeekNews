package com.example.sqlliteopenhelperdemo2.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import bean.ResultBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RESULT_BEAN".
*/
public class ResultBeanDao extends AbstractDao<ResultBean, Long> {

    public static final String TABLENAME = "RESULT_BEAN";

    /**
     * Properties of entity ResultBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "Lid");
        public final static Property Country = new Property(1, String.class, "country", false, "COUNTRY");
        public final static Property Piao_id = new Property(2, String.class, "piao_id", false, "PIAO_ID");
        public final static Property Res_encryption_flag = new Property(3, String.class, "res_encryption_flag", false, "RES_ENCRYPTION_FLAG");
        public final static Property Mv_provider = new Property(4, String.class, "mv_provider", false, "MV_PROVIDER");
        public final static Property Biaoshi = new Property(5, String.class, "biaoshi", false, "BIAOSHI");
        public final static Property Artist_name = new Property(6, String.class, "artist_name", false, "ARTIST_NAME");
        public final static Property Is_first_publish = new Property(7, int.class, "is_first_publish", false, "IS_FIRST_PUBLISH");
        public final static Property Language = new Property(8, String.class, "language", false, "LANGUAGE");
        public final static Property Album_1000_1000 = new Property(9, String.class, "album_1000_1000", false, "ALBUM_1000_1000");
        public final static Property Korean_bb_song = new Property(10, String.class, "korean_bb_song", false, "KOREAN_BB_SONG");
        public final static Property Pic_huge = new Property(11, String.class, "pic_huge", false, "PIC_HUGE");
        public final static Property All_rate = new Property(12, String.class, "all_rate", false, "ALL_RATE");
        public final static Property Song_source = new Property(13, String.class, "song_source", false, "SONG_SOURCE");
        public final static Property Song_id = new Property(14, String.class, "song_id", false, "SONG_ID");
        public final static Property Album_500_500 = new Property(15, String.class, "album_500_500", false, "ALBUM_500_500");
        public final static Property Rank = new Property(16, String.class, "rank", false, "RANK");
        public final static Property Pic_premium = new Property(17, String.class, "pic_premium", false, "PIC_PREMIUM");
        public final static Property Album_800_800 = new Property(18, String.class, "album_800_800", false, "ALBUM_800_800");
        public final static Property Info = new Property(19, String.class, "info", false, "INFO");
        public final static Property Area = new Property(20, String.class, "area", false, "AREA");
        public final static Property Si_proxycompany = new Property(21, String.class, "si_proxycompany", false, "SI_PROXYCOMPANY");
        public final static Property Has_mv_mobile = new Property(22, int.class, "has_mv_mobile", false, "HAS_MV_MOBILE");
        public final static Property Is_new = new Property(23, String.class, "is_new", false, "IS_NEW");
        public final static Property Author = new Property(24, String.class, "author", false, "AUTHOR");
        public final static Property Resource_type = new Property(25, String.class, "resource_type", false, "RESOURCE_TYPE");
        public final static Property Has_filmtv = new Property(26, String.class, "has_filmtv", false, "HAS_FILMTV");
        public final static Property All_artist_ting_uid = new Property(27, String.class, "all_artist_ting_uid", false, "ALL_ARTIST_TING_UID");
        public final static Property Artist_id = new Property(28, String.class, "artist_id", false, "ARTIST_ID");
        public final static Property Versions = new Property(29, String.class, "versions", false, "VERSIONS");
        public final static Property Publishtime = new Property(30, String.class, "publishtime", false, "PUBLISHTIME");
        public final static Property Style = new Property(31, String.class, "style", false, "STYLE");
        public final static Property Album_id = new Property(32, String.class, "album_id", false, "ALBUM_ID");
        public final static Property Album_no = new Property(33, String.class, "album_no", false, "ALBUM_NO");
        public final static Property Resource_type_ext = new Property(34, String.class, "resource_type_ext", false, "RESOURCE_TYPE_EXT");
        public final static Property Del_status = new Property(35, String.class, "del_status", false, "DEL_STATUS");
        public final static Property Hot = new Property(36, String.class, "hot", false, "HOT");
        public final static Property Toneid = new Property(37, String.class, "toneid", false, "TONEID");
        public final static Property Title = new Property(38, String.class, "title", false, "TITLE");
        public final static Property Pic_big = new Property(39, String.class, "pic_big", false, "PIC_BIG");
        public final static Property Relate_status = new Property(40, String.class, "relate_status", false, "RELATE_STATUS");
        public final static Property Rank_change = new Property(41, String.class, "rank_change", false, "RANK_CHANGE");
        public final static Property Lrclink = new Property(42, String.class, "lrclink", false, "LRCLINK");
        public final static Property File_duration = new Property(43, int.class, "file_duration", false, "FILE_DURATION");
        public final static Property Havehigh = new Property(44, int.class, "havehigh", false, "HAVEHIGH");
        public final static Property Charge = new Property(45, int.class, "charge", false, "CHARGE");
        public final static Property Pic_radio = new Property(46, String.class, "pic_radio", false, "PIC_RADIO");
        public final static Property Learn = new Property(47, int.class, "learn", false, "LEARN");
        public final static Property Pic_s500 = new Property(48, String.class, "pic_s500", false, "PIC_S500");
        public final static Property All_artist_id = new Property(49, String.class, "all_artist_id", false, "ALL_ARTIST_ID");
        public final static Property Pic_small = new Property(50, String.class, "pic_small", false, "PIC_SMALL");
        public final static Property Bitrate_fee = new Property(51, String.class, "bitrate_fee", false, "BITRATE_FEE");
        public final static Property Has_mv = new Property(52, int.class, "has_mv", false, "HAS_MV");
        public final static Property Copy_type = new Property(53, String.class, "copy_type", false, "COPY_TYPE");
        public final static Property Ting_uid = new Property(54, String.class, "ting_uid", false, "TING_UID");
        public final static Property Album_title = new Property(55, String.class, "album_title", false, "ALBUM_TITLE");
    }


    public ResultBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ResultBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RESULT_BEAN\" (" + //
                "\"Lid\" INTEGER PRIMARY KEY ," + // 0: id
                "\"COUNTRY\" TEXT," + // 1: country
                "\"PIAO_ID\" TEXT," + // 2: piao_id
                "\"RES_ENCRYPTION_FLAG\" TEXT," + // 3: res_encryption_flag
                "\"MV_PROVIDER\" TEXT," + // 4: mv_provider
                "\"BIAOSHI\" TEXT," + // 5: biaoshi
                "\"ARTIST_NAME\" TEXT," + // 6: artist_name
                "\"IS_FIRST_PUBLISH\" INTEGER NOT NULL ," + // 7: is_first_publish
                "\"LANGUAGE\" TEXT," + // 8: language
                "\"ALBUM_1000_1000\" TEXT," + // 9: album_1000_1000
                "\"KOREAN_BB_SONG\" TEXT," + // 10: korean_bb_song
                "\"PIC_HUGE\" TEXT," + // 11: pic_huge
                "\"ALL_RATE\" TEXT," + // 12: all_rate
                "\"SONG_SOURCE\" TEXT," + // 13: song_source
                "\"SONG_ID\" TEXT," + // 14: song_id
                "\"ALBUM_500_500\" TEXT," + // 15: album_500_500
                "\"RANK\" TEXT," + // 16: rank
                "\"PIC_PREMIUM\" TEXT," + // 17: pic_premium
                "\"ALBUM_800_800\" TEXT," + // 18: album_800_800
                "\"INFO\" TEXT," + // 19: info
                "\"AREA\" TEXT," + // 20: area
                "\"SI_PROXYCOMPANY\" TEXT," + // 21: si_proxycompany
                "\"HAS_MV_MOBILE\" INTEGER NOT NULL ," + // 22: has_mv_mobile
                "\"IS_NEW\" TEXT," + // 23: is_new
                "\"AUTHOR\" TEXT," + // 24: author
                "\"RESOURCE_TYPE\" TEXT," + // 25: resource_type
                "\"HAS_FILMTV\" TEXT," + // 26: has_filmtv
                "\"ALL_ARTIST_TING_UID\" TEXT," + // 27: all_artist_ting_uid
                "\"ARTIST_ID\" TEXT," + // 28: artist_id
                "\"VERSIONS\" TEXT," + // 29: versions
                "\"PUBLISHTIME\" TEXT," + // 30: publishtime
                "\"STYLE\" TEXT," + // 31: style
                "\"ALBUM_ID\" TEXT," + // 32: album_id
                "\"ALBUM_NO\" TEXT," + // 33: album_no
                "\"RESOURCE_TYPE_EXT\" TEXT," + // 34: resource_type_ext
                "\"DEL_STATUS\" TEXT," + // 35: del_status
                "\"HOT\" TEXT," + // 36: hot
                "\"TONEID\" TEXT," + // 37: toneid
                "\"TITLE\" TEXT," + // 38: title
                "\"PIC_BIG\" TEXT," + // 39: pic_big
                "\"RELATE_STATUS\" TEXT," + // 40: relate_status
                "\"RANK_CHANGE\" TEXT," + // 41: rank_change
                "\"LRCLINK\" TEXT," + // 42: lrclink
                "\"FILE_DURATION\" INTEGER NOT NULL ," + // 43: file_duration
                "\"HAVEHIGH\" INTEGER NOT NULL ," + // 44: havehigh
                "\"CHARGE\" INTEGER NOT NULL ," + // 45: charge
                "\"PIC_RADIO\" TEXT," + // 46: pic_radio
                "\"LEARN\" INTEGER NOT NULL ," + // 47: learn
                "\"PIC_S500\" TEXT," + // 48: pic_s500
                "\"ALL_ARTIST_ID\" TEXT," + // 49: all_artist_id
                "\"PIC_SMALL\" TEXT," + // 50: pic_small
                "\"BITRATE_FEE\" TEXT," + // 51: bitrate_fee
                "\"HAS_MV\" INTEGER NOT NULL ," + // 52: has_mv
                "\"COPY_TYPE\" TEXT," + // 53: copy_type
                "\"TING_UID\" TEXT," + // 54: ting_uid
                "\"ALBUM_TITLE\" TEXT);"); // 55: album_title
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RESULT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ResultBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
 
        String piao_id = entity.getPiao_id();
        if (piao_id != null) {
            stmt.bindString(3, piao_id);
        }
 
        String res_encryption_flag = entity.getRes_encryption_flag();
        if (res_encryption_flag != null) {
            stmt.bindString(4, res_encryption_flag);
        }
 
        String mv_provider = entity.getMv_provider();
        if (mv_provider != null) {
            stmt.bindString(5, mv_provider);
        }
 
        String biaoshi = entity.getBiaoshi();
        if (biaoshi != null) {
            stmt.bindString(6, biaoshi);
        }
 
        String artist_name = entity.getArtist_name();
        if (artist_name != null) {
            stmt.bindString(7, artist_name);
        }
        stmt.bindLong(8, entity.getIs_first_publish());
 
        String language = entity.getLanguage();
        if (language != null) {
            stmt.bindString(9, language);
        }
 
        String album_1000_1000 = entity.getAlbum_1000_1000();
        if (album_1000_1000 != null) {
            stmt.bindString(10, album_1000_1000);
        }
 
        String korean_bb_song = entity.getKorean_bb_song();
        if (korean_bb_song != null) {
            stmt.bindString(11, korean_bb_song);
        }
 
        String pic_huge = entity.getPic_huge();
        if (pic_huge != null) {
            stmt.bindString(12, pic_huge);
        }
 
        String all_rate = entity.getAll_rate();
        if (all_rate != null) {
            stmt.bindString(13, all_rate);
        }
 
        String song_source = entity.getSong_source();
        if (song_source != null) {
            stmt.bindString(14, song_source);
        }
 
        String song_id = entity.getSong_id();
        if (song_id != null) {
            stmt.bindString(15, song_id);
        }
 
        String album_500_500 = entity.getAlbum_500_500();
        if (album_500_500 != null) {
            stmt.bindString(16, album_500_500);
        }
 
        String rank = entity.getRank();
        if (rank != null) {
            stmt.bindString(17, rank);
        }
 
        String pic_premium = entity.getPic_premium();
        if (pic_premium != null) {
            stmt.bindString(18, pic_premium);
        }
 
        String album_800_800 = entity.getAlbum_800_800();
        if (album_800_800 != null) {
            stmt.bindString(19, album_800_800);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(20, info);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(21, area);
        }
 
        String si_proxycompany = entity.getSi_proxycompany();
        if (si_proxycompany != null) {
            stmt.bindString(22, si_proxycompany);
        }
        stmt.bindLong(23, entity.getHas_mv_mobile());
 
        String is_new = entity.getIs_new();
        if (is_new != null) {
            stmt.bindString(24, is_new);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(25, author);
        }
 
        String resource_type = entity.getResource_type();
        if (resource_type != null) {
            stmt.bindString(26, resource_type);
        }
 
        String has_filmtv = entity.getHas_filmtv();
        if (has_filmtv != null) {
            stmt.bindString(27, has_filmtv);
        }
 
        String all_artist_ting_uid = entity.getAll_artist_ting_uid();
        if (all_artist_ting_uid != null) {
            stmt.bindString(28, all_artist_ting_uid);
        }
 
        String artist_id = entity.getArtist_id();
        if (artist_id != null) {
            stmt.bindString(29, artist_id);
        }
 
        String versions = entity.getVersions();
        if (versions != null) {
            stmt.bindString(30, versions);
        }
 
        String publishtime = entity.getPublishtime();
        if (publishtime != null) {
            stmt.bindString(31, publishtime);
        }
 
        String style = entity.getStyle();
        if (style != null) {
            stmt.bindString(32, style);
        }
 
        String album_id = entity.getAlbum_id();
        if (album_id != null) {
            stmt.bindString(33, album_id);
        }
 
        String album_no = entity.getAlbum_no();
        if (album_no != null) {
            stmt.bindString(34, album_no);
        }
 
        String resource_type_ext = entity.getResource_type_ext();
        if (resource_type_ext != null) {
            stmt.bindString(35, resource_type_ext);
        }
 
        String del_status = entity.getDel_status();
        if (del_status != null) {
            stmt.bindString(36, del_status);
        }
 
        String hot = entity.getHot();
        if (hot != null) {
            stmt.bindString(37, hot);
        }
 
        String toneid = entity.getToneid();
        if (toneid != null) {
            stmt.bindString(38, toneid);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(39, title);
        }
 
        String pic_big = entity.getPic_big();
        if (pic_big != null) {
            stmt.bindString(40, pic_big);
        }
 
        String relate_status = entity.getRelate_status();
        if (relate_status != null) {
            stmt.bindString(41, relate_status);
        }
 
        String rank_change = entity.getRank_change();
        if (rank_change != null) {
            stmt.bindString(42, rank_change);
        }
 
        String lrclink = entity.getLrclink();
        if (lrclink != null) {
            stmt.bindString(43, lrclink);
        }
        stmt.bindLong(44, entity.getFile_duration());
        stmt.bindLong(45, entity.getHavehigh());
        stmt.bindLong(46, entity.getCharge());
 
        String pic_radio = entity.getPic_radio();
        if (pic_radio != null) {
            stmt.bindString(47, pic_radio);
        }
        stmt.bindLong(48, entity.getLearn());
 
        String pic_s500 = entity.getPic_s500();
        if (pic_s500 != null) {
            stmt.bindString(49, pic_s500);
        }
 
        String all_artist_id = entity.getAll_artist_id();
        if (all_artist_id != null) {
            stmt.bindString(50, all_artist_id);
        }
 
        String pic_small = entity.getPic_small();
        if (pic_small != null) {
            stmt.bindString(51, pic_small);
        }
 
        String bitrate_fee = entity.getBitrate_fee();
        if (bitrate_fee != null) {
            stmt.bindString(52, bitrate_fee);
        }
        stmt.bindLong(53, entity.getHas_mv());
 
        String copy_type = entity.getCopy_type();
        if (copy_type != null) {
            stmt.bindString(54, copy_type);
        }
 
        String ting_uid = entity.getTing_uid();
        if (ting_uid != null) {
            stmt.bindString(55, ting_uid);
        }
 
        String album_title = entity.getAlbum_title();
        if (album_title != null) {
            stmt.bindString(56, album_title);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ResultBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
 
        String piao_id = entity.getPiao_id();
        if (piao_id != null) {
            stmt.bindString(3, piao_id);
        }
 
        String res_encryption_flag = entity.getRes_encryption_flag();
        if (res_encryption_flag != null) {
            stmt.bindString(4, res_encryption_flag);
        }
 
        String mv_provider = entity.getMv_provider();
        if (mv_provider != null) {
            stmt.bindString(5, mv_provider);
        }
 
        String biaoshi = entity.getBiaoshi();
        if (biaoshi != null) {
            stmt.bindString(6, biaoshi);
        }
 
        String artist_name = entity.getArtist_name();
        if (artist_name != null) {
            stmt.bindString(7, artist_name);
        }
        stmt.bindLong(8, entity.getIs_first_publish());
 
        String language = entity.getLanguage();
        if (language != null) {
            stmt.bindString(9, language);
        }
 
        String album_1000_1000 = entity.getAlbum_1000_1000();
        if (album_1000_1000 != null) {
            stmt.bindString(10, album_1000_1000);
        }
 
        String korean_bb_song = entity.getKorean_bb_song();
        if (korean_bb_song != null) {
            stmt.bindString(11, korean_bb_song);
        }
 
        String pic_huge = entity.getPic_huge();
        if (pic_huge != null) {
            stmt.bindString(12, pic_huge);
        }
 
        String all_rate = entity.getAll_rate();
        if (all_rate != null) {
            stmt.bindString(13, all_rate);
        }
 
        String song_source = entity.getSong_source();
        if (song_source != null) {
            stmt.bindString(14, song_source);
        }
 
        String song_id = entity.getSong_id();
        if (song_id != null) {
            stmt.bindString(15, song_id);
        }
 
        String album_500_500 = entity.getAlbum_500_500();
        if (album_500_500 != null) {
            stmt.bindString(16, album_500_500);
        }
 
        String rank = entity.getRank();
        if (rank != null) {
            stmt.bindString(17, rank);
        }
 
        String pic_premium = entity.getPic_premium();
        if (pic_premium != null) {
            stmt.bindString(18, pic_premium);
        }
 
        String album_800_800 = entity.getAlbum_800_800();
        if (album_800_800 != null) {
            stmt.bindString(19, album_800_800);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(20, info);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(21, area);
        }
 
        String si_proxycompany = entity.getSi_proxycompany();
        if (si_proxycompany != null) {
            stmt.bindString(22, si_proxycompany);
        }
        stmt.bindLong(23, entity.getHas_mv_mobile());
 
        String is_new = entity.getIs_new();
        if (is_new != null) {
            stmt.bindString(24, is_new);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(25, author);
        }
 
        String resource_type = entity.getResource_type();
        if (resource_type != null) {
            stmt.bindString(26, resource_type);
        }
 
        String has_filmtv = entity.getHas_filmtv();
        if (has_filmtv != null) {
            stmt.bindString(27, has_filmtv);
        }
 
        String all_artist_ting_uid = entity.getAll_artist_ting_uid();
        if (all_artist_ting_uid != null) {
            stmt.bindString(28, all_artist_ting_uid);
        }
 
        String artist_id = entity.getArtist_id();
        if (artist_id != null) {
            stmt.bindString(29, artist_id);
        }
 
        String versions = entity.getVersions();
        if (versions != null) {
            stmt.bindString(30, versions);
        }
 
        String publishtime = entity.getPublishtime();
        if (publishtime != null) {
            stmt.bindString(31, publishtime);
        }
 
        String style = entity.getStyle();
        if (style != null) {
            stmt.bindString(32, style);
        }
 
        String album_id = entity.getAlbum_id();
        if (album_id != null) {
            stmt.bindString(33, album_id);
        }
 
        String album_no = entity.getAlbum_no();
        if (album_no != null) {
            stmt.bindString(34, album_no);
        }
 
        String resource_type_ext = entity.getResource_type_ext();
        if (resource_type_ext != null) {
            stmt.bindString(35, resource_type_ext);
        }
 
        String del_status = entity.getDel_status();
        if (del_status != null) {
            stmt.bindString(36, del_status);
        }
 
        String hot = entity.getHot();
        if (hot != null) {
            stmt.bindString(37, hot);
        }
 
        String toneid = entity.getToneid();
        if (toneid != null) {
            stmt.bindString(38, toneid);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(39, title);
        }
 
        String pic_big = entity.getPic_big();
        if (pic_big != null) {
            stmt.bindString(40, pic_big);
        }
 
        String relate_status = entity.getRelate_status();
        if (relate_status != null) {
            stmt.bindString(41, relate_status);
        }
 
        String rank_change = entity.getRank_change();
        if (rank_change != null) {
            stmt.bindString(42, rank_change);
        }
 
        String lrclink = entity.getLrclink();
        if (lrclink != null) {
            stmt.bindString(43, lrclink);
        }
        stmt.bindLong(44, entity.getFile_duration());
        stmt.bindLong(45, entity.getHavehigh());
        stmt.bindLong(46, entity.getCharge());
 
        String pic_radio = entity.getPic_radio();
        if (pic_radio != null) {
            stmt.bindString(47, pic_radio);
        }
        stmt.bindLong(48, entity.getLearn());
 
        String pic_s500 = entity.getPic_s500();
        if (pic_s500 != null) {
            stmt.bindString(49, pic_s500);
        }
 
        String all_artist_id = entity.getAll_artist_id();
        if (all_artist_id != null) {
            stmt.bindString(50, all_artist_id);
        }
 
        String pic_small = entity.getPic_small();
        if (pic_small != null) {
            stmt.bindString(51, pic_small);
        }
 
        String bitrate_fee = entity.getBitrate_fee();
        if (bitrate_fee != null) {
            stmt.bindString(52, bitrate_fee);
        }
        stmt.bindLong(53, entity.getHas_mv());
 
        String copy_type = entity.getCopy_type();
        if (copy_type != null) {
            stmt.bindString(54, copy_type);
        }
 
        String ting_uid = entity.getTing_uid();
        if (ting_uid != null) {
            stmt.bindString(55, ting_uid);
        }
 
        String album_title = entity.getAlbum_title();
        if (album_title != null) {
            stmt.bindString(56, album_title);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ResultBean readEntity(Cursor cursor, int offset) {
        ResultBean entity = new ResultBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // country
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // piao_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // res_encryption_flag
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mv_provider
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // biaoshi
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // artist_name
            cursor.getInt(offset + 7), // is_first_publish
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // language
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // album_1000_1000
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // korean_bb_song
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // pic_huge
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // all_rate
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // song_source
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // song_id
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // album_500_500
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // rank
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // pic_premium
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // album_800_800
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // info
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // area
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // si_proxycompany
            cursor.getInt(offset + 22), // has_mv_mobile
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // is_new
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // author
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // resource_type
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // has_filmtv
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // all_artist_ting_uid
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // artist_id
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // versions
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // publishtime
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // style
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // album_id
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // album_no
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // resource_type_ext
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // del_status
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36), // hot
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // toneid
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38), // title
            cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39), // pic_big
            cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40), // relate_status
            cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41), // rank_change
            cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42), // lrclink
            cursor.getInt(offset + 43), // file_duration
            cursor.getInt(offset + 44), // havehigh
            cursor.getInt(offset + 45), // charge
            cursor.isNull(offset + 46) ? null : cursor.getString(offset + 46), // pic_radio
            cursor.getInt(offset + 47), // learn
            cursor.isNull(offset + 48) ? null : cursor.getString(offset + 48), // pic_s500
            cursor.isNull(offset + 49) ? null : cursor.getString(offset + 49), // all_artist_id
            cursor.isNull(offset + 50) ? null : cursor.getString(offset + 50), // pic_small
            cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51), // bitrate_fee
            cursor.getInt(offset + 52), // has_mv
            cursor.isNull(offset + 53) ? null : cursor.getString(offset + 53), // copy_type
            cursor.isNull(offset + 54) ? null : cursor.getString(offset + 54), // ting_uid
            cursor.isNull(offset + 55) ? null : cursor.getString(offset + 55) // album_title
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ResultBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCountry(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPiao_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setRes_encryption_flag(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMv_provider(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBiaoshi(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setArtist_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIs_first_publish(cursor.getInt(offset + 7));
        entity.setLanguage(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAlbum_1000_1000(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setKorean_bb_song(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPic_huge(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setAll_rate(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setSong_source(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setSong_id(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setAlbum_500_500(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setRank(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setPic_premium(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setAlbum_800_800(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setInfo(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setArea(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setSi_proxycompany(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setHas_mv_mobile(cursor.getInt(offset + 22));
        entity.setIs_new(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setAuthor(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setResource_type(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setHas_filmtv(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setAll_artist_ting_uid(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setArtist_id(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setVersions(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setPublishtime(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setStyle(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setAlbum_id(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setAlbum_no(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setResource_type_ext(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setDel_status(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setHot(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
        entity.setToneid(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setTitle(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
        entity.setPic_big(cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39));
        entity.setRelate_status(cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40));
        entity.setRank_change(cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41));
        entity.setLrclink(cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42));
        entity.setFile_duration(cursor.getInt(offset + 43));
        entity.setHavehigh(cursor.getInt(offset + 44));
        entity.setCharge(cursor.getInt(offset + 45));
        entity.setPic_radio(cursor.isNull(offset + 46) ? null : cursor.getString(offset + 46));
        entity.setLearn(cursor.getInt(offset + 47));
        entity.setPic_s500(cursor.isNull(offset + 48) ? null : cursor.getString(offset + 48));
        entity.setAll_artist_id(cursor.isNull(offset + 49) ? null : cursor.getString(offset + 49));
        entity.setPic_small(cursor.isNull(offset + 50) ? null : cursor.getString(offset + 50));
        entity.setBitrate_fee(cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51));
        entity.setHas_mv(cursor.getInt(offset + 52));
        entity.setCopy_type(cursor.isNull(offset + 53) ? null : cursor.getString(offset + 53));
        entity.setTing_uid(cursor.isNull(offset + 54) ? null : cursor.getString(offset + 54));
        entity.setAlbum_title(cursor.isNull(offset + 55) ? null : cursor.getString(offset + 55));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ResultBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ResultBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ResultBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
