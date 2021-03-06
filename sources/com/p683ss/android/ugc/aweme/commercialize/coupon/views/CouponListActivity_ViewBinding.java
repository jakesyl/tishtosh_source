package com.p683ss.android.ugc.aweme.commercialize.coupon.views;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity_ViewBinding */
public class CouponListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CouponListActivity f68006a;

    /* renamed from: b */
    private View f68007b;

    /* renamed from: c */
    private View f68008c;

    public void unbind() {
        CouponListActivity couponListActivity = this.f68006a;
        if (couponListActivity != null) {
            this.f68006a = null;
            couponListActivity.title = null;
            couponListActivity.mStatusView = null;
            couponListActivity.mListView = null;
            couponListActivity.merchantTv = null;
            this.f68007b.setOnClickListener(null);
            this.f68007b = null;
            this.f68008c.setOnClickListener(null);
            this.f68008c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CouponListActivity_ViewBinding(final CouponListActivity couponListActivity, View view) {
        this.f68006a = couponListActivity;
        couponListActivity.title = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'title'", DmtTextView.class);
        couponListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        couponListActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.blc, "field 'merchantTv' and method 'onClick'");
        couponListActivity.merchantTv = (TextView) Utils.castView(findRequiredView, R.id.blc, "field 'merchantTv'", TextView.class);
        this.f68007b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponListActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.im, "method 'onClick'");
        this.f68008c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                couponListActivity.onClick(view);
            }
        });
    }
}
