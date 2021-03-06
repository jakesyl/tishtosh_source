package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p728c.C11566a;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p728c.C11577g;
import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p742l.C11731c;
import com.bytedance.jedi.p725a.p742l.C11732d;
import com.bytedance.jedi.p725a.p742l.C11735f;
import com.bytedance.jedi.p725a.p742l.C11738g;
import java.util.Arrays;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p092j.C2159a;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.a.e */
public interface C11544e<K, V> extends C11729a<C52847n<? extends K, ? extends List<? extends V>>> {

    /* renamed from: b */
    public static final C11545a f30925b = C11545a.f30926a;

    /* renamed from: com.bytedance.jedi.a.a.e$a */
    public static final class C11545a {

        /* renamed from: a */
        static final /* synthetic */ C11545a f30926a = new C11545a();

        /* renamed from: com.bytedance.jedi.a.a.e$a$a */
        public static final class C11546a<K, V> extends C11566a<K, List<? extends V>> implements C11731c<C52847n<? extends K, ? extends List<? extends V>>>, C11732d<C52847n<? extends K, ? extends List<? extends V>>> {

            /* renamed from: a */
            private final /* synthetic */ C11735f f30927a;

            /* renamed from: b */
            private final /* synthetic */ C11738g f30928b;

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$a */
            static final class C11547a<T> implements C1715j<C52847n<? extends K, ? extends List<? extends V>>> {

                /* renamed from: a */
                final /* synthetic */ Object f30929a;

                C11547a(Object obj) {
                    this.f30929a = obj;
                }

                /* renamed from: a */
                public final /* synthetic */ boolean mo6207a(Object obj) {
                    C52847n nVar = (C52847n) obj;
                    C52711k.m112240b(nVar, "it");
                    return C52711k.m112239a(this.f30929a, nVar.getFirst());
                }
            }

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$b */
            static final class C11548b<T, R> implements C1711f<T, R> {

                /* renamed from: a */
                public static final C11548b f30930a = new C11548b();

                C11548b() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C52847n nVar = (C52847n) obj;
                    C52711k.m112240b(nVar, "it");
                    return C11577g.m23686a(nVar.getSecond());
                }
            }

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$c */
            static final class C11549c<T> implements C1715j<C11730b<C52847n<? extends K, ? extends List<? extends V>>>> {

                /* renamed from: a */
                final /* synthetic */ C11574e[] f30931a;

                C11549c(C11574e[] eVarArr) {
                    this.f30931a = eVarArr;
                }

                /* renamed from: a */
                public final /* synthetic */ boolean mo6207a(Object obj) {
                    boolean z;
                    boolean z2;
                    C11730b bVar = (C11730b) obj;
                    C52711k.m112240b(bVar, "traceable");
                    C11574e[] eVarArr = this.f30931a;
                    int length = eVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        C11729a c = eVarArr[i].mo22311c();
                        if (c != null) {
                            z2 = bVar.mo22488a(c);
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        return true;
                    }
                    return false;
                }
            }

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$d */
            static final class C11550d<T, R> implements C1711f<T, R> {

                /* renamed from: a */
                public static final C11550d f30932a = new C11550d();

                C11550d() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C11730b bVar = (C11730b) obj;
                    C52711k.m112240b(bVar, "it");
                    return (C52847n) bVar.mo22487a();
                }
            }

            /* renamed from: a */
            public final void mo22302a(C11730b<C52847n<K, List<V>>> bVar) {
                C52711k.m112240b(bVar, "traceable");
                this.f30927a.mo22302a(bVar);
            }

            /* renamed from: b */
            public final C2201v<C11730b<C52847n<K, List<V>>>> mo22303b() {
                return this.f30927a.mo22303b();
            }

            /* renamed from: b */
            public final void mo22304b(C11730b<C52847n<K, List<V>>> bVar) {
                C52711k.m112240b(bVar, "traceable");
                this.f30928b.mo22304b(bVar);
            }

            /* renamed from: a */
            public final C2201v<List<C52847n<K, List<V>>>> mo22298a() {
                return C11551f.m23658a(this).mo22290b();
            }

            public C11546a(C11544e<K, V> eVar) {
                C52711k.m112240b(eVar, "inheritance");
                C11729a aVar = eVar;
                super(aVar);
                this.f30927a = new C11735f(aVar);
                this.f30928b = new C11738g(aVar);
            }

            /* renamed from: a */
            public final C2201v<C11575f<List<V>>> mo22299a(K k) {
                return C11551f.m23658a(this).mo22287a(k);
            }

            /* renamed from: a */
            public final C2201v<C11575f<List<V>>> mo22300a(K k, C11574e<?, ?>... eVarArr) {
                C52711k.m112240b(eVarArr, "exclude");
                C2201v g = mo22301a(false, (C11574e<?, ?>[]) (C11574e[]) Arrays.copyOf(eVarArr, eVarArr.length)).mo6548g();
                C52711k.m112236a((Object) g, "observeAll(false, *exclude).share()");
                C2201v<C11575f<List<V>>> d = C2159a.m6512a(g).mo6522a((C1715j<? super T>) new C11547a<Object>(k)).mo6541d((C1711f<? super T, ? extends R>) C11548b.f30930a);
                C52711k.m112236a((Object) d, "observeAll(false, *exclu… { it.second.optional() }");
                return d;
            }

            /* renamed from: a */
            public final C2201v<List<C52847n<K, List<V>>>> mo22301a(boolean z, C11574e<?, ?>... eVarArr) {
                C52711k.m112240b(eVarArr, "exclude");
                C2201v d = mo22303b().mo6522a((C1715j<? super T>) new C11549c<Object>(eVarArr)).mo6541d((C1711f<? super T, ? extends R>) C11550d.f30932a);
                C52711k.m112236a((Object) d, "observeTraceable()\n     …    .map { it.payload() }");
                C2201v<List<C52847n<K, List<V>>>> a = m23670a(d, z).mo6514a(C1667a.m5940a());
                C52711k.m112236a((Object) a, "observeTraceable()\n     …dSchedulers.mainThread())");
                return a;
            }
        }

        private C11545a() {
        }
    }

    /* renamed from: a */
    C2201v<C11575f<List<V>>> mo22287a(K k);

    /* renamed from: a */
    void mo22289a(K k, List<? extends V> list);

    /* renamed from: b */
    C2201v<List<C52847n<K, List<V>>>> mo22290b();
}
