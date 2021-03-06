package com.p683ss.android.ugc.aweme.tile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService */
public final class HotVideoTileService extends TileService {

    /* renamed from: b */
    public static final long f118248b = 2500;

    /* renamed from: c */
    public static final C46789a f118249c = new C46789a(null);

    /* renamed from: a */
    public volatile boolean f118250a;

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$a */
    public static final class C46789a {
        private C46789a() {
        }

        public /* synthetic */ C46789a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$b */
    static final class C46790b<T> implements C1710e<Activity> {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f118251a;

        C46790b(HotVideoTileService hotVideoTileService) {
            this.f118251a = hotVideoTileService;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            if (((Activity) obj) instanceof C11018b) {
                this.f118251a.f118250a = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$c */
    static final class C46791c<TTaskResult, TContinuationResult> implements C0011g<Void, C0013i<Void>> {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f118252a;

        C46791c(HotVideoTileService hotVideoTileService) {
            this.f118252a = hotVideoTileService;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", this.f118252a.f118250a ? 1 : 0);
            C9951d.m19999a("tile_service_open", jSONObject, null, null);
            return iVar;
        }
    }

    public final void onStartListening() {
        super.onStartListening();
        m101640a(1);
    }

    public final void onTileAdded() {
        super.onTileAdded();
        C26890h.m65011a("add_to_notificationbar", C23089d.m56640a().mo47829a("features", "watch_video").f61491a);
    }

    public final void onTileRemoved() {
        super.onTileRemoved();
        C26890h.m65011a("delete_from_notificationbar", C23089d.m56640a().mo47829a("features", "watch_video").f61491a);
    }

    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - C22574a.m55738f().f60708i;
        if (uptimeMillis <= 1000) {
            C26890h.m65011a("active_in_notificationbar", C23089d.m56640a().mo47827a("time", uptimeMillis).mo47829a("features", "watch_video").f61491a);
        }
        m101640a(1);
    }

    public final void onClick() {
        super.onClick();
        if (!C11016e.m22313h()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, DeepLinkHandlerActivity.class);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        int j = C11010c.m22289j();
        if (j <= 0) {
            j = C23018b.f61359a;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, DeepLinkHandlerActivity.class);
        StringBuilder sb = new StringBuilder(C23057c.f61424b);
        sb.append(j);
        sb.append("://feed?tab=1");
        intent2.setData(Uri.parse(sb.toString()));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.f118250a = false;
            C11016e.m22304b().mo6545f((C1710e<? super T>) new C46790b<Object>(this));
            C0013i.m12a(f118248b).mo24b(new C46791c(this), C0013i.f25b);
        } catch (Exception e) {
            C9220a.m18311a((Throwable) e);
        }
        C26890h.m65011a("click_notificationbar", C23089d.m56640a().mo47829a("features", "watch_video").f61491a);
    }

    /* renamed from: a */
    private final void m101640a(int i) {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
        }
        if (qsTile != null) {
            qsTile.setLabel(getString(R.string.g2g));
        }
        if (qsTile != null) {
            qsTile.updateTile();
        }
    }
}
