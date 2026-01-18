/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Axton Urbina
 */
public class Board {
    private Node aa, ab, ac, ad, ae, af, ag, ah,
                 ba, bb, bc, bd, be, bf, bg, bh,
                 ca, cb, cc, cd, ce, cf, cg, ch,
                 da, db, dc, dd, de, df, dg, dh,
                 ea, eb, ec, ed, ee, ef, eg, eh,
                 fa, fb, fc, fd, fe, ff, fg, fh,
                 ga, gb, gc, gd, ge, gf, gg, gh,
                 ha, hb, hc, hd, he, hf, hg, hh;  
  

    public Board() {
        boardInitializer();
        setDirections();
    }

    public Node getFirst() {
        return aa;
    }    
    
    // Se inicializan los nodos con todas sus direcciones en nulo
    public void boardInitializer() {
    
        aa = new Node('v');
        ab = new Node('v');
        ac = new Node('v'); 
        ad = new Node('v'); 
        ae = new Node('v');
        af = new Node('v');
        ag = new Node('v');
        ah = new Node('v');
        
        ba = new Node('v');
        bb = new Node('v');
        bc = new Node('v');
        bd = new Node('v');
        be = new Node('v');
        bf = new Node('v');
        bg = new Node('v');
        bh = new Node('v');
        
        ca = new Node('v');
        cb = new Node('v');
        cc = new Node('v');
        cd = new Node('v');
        ce = new Node('v');
        cf = new Node('v');
        cg = new Node('v');
        ch = new Node('v');
        
        da = new Node('v');
        db = new Node('v');
        dc = new Node('v');
        dd = new Node('b');
        de = new Node('n');
        df = new Node('v');
        dg = new Node('v');
        dh = new Node('v');
        
        ea = new Node('v');
        eb = new Node('v');
        ec = new Node('v');
        ed = new Node('n');
        ee = new Node('b');
        ef = new Node('v');
        eg = new Node('v');
        eh = new Node('v');
        
        fa = new Node('v');
        fb = new Node('v');
        fc = new Node('v');
        fd = new Node('v');
        fe = new Node('v');
        ff = new Node('v');
        fg = new Node('v');
        fh = new Node('v');
        
        ga = new Node('v');
        gb = new Node('v');
        gc = new Node('v');
        gd = new Node('v');
        ge = new Node('v');
        gf = new Node('v');
        gg = new Node('v');
        gh = new Node('v');
        
        ha = new Node('v');
        hb = new Node('v');
        hc = new Node('v');
        hd = new Node('v');
        he = new Node('v');
        hf = new Node('v');
        hg = new Node('v');
        hh = new Node('v');
    }
    
    // Establece manualmente (a pata) las direcciones de cada uno de los nodos
    public void setDirections() {
        // Conexiones de las esquinas
        aa.setEast(ab);
        aa.setSoutheast(bb);
        aa.setSouth(ba);
        
        ah.setWest(ag);
        ah.setSouthwest(bg);
        ah.setSouth(bh);
        
        ha.setNorth(ga);
        ha.setNortheast(gb);
        ha.setEast(hb);
        
        hh.setNorth(gh);
        hh.setNorthwest(gg);
        hh.setWest(hg);
        
        // Conexiones de la parte superior
        ab.setWest(aa);
        ab.setSouthwest(ba);
        ab.setSouth(bb);
        ab.setSoutheast(bc);
        ab.setEast(ac);
        
        ac.setWest(ab);
        ac.setSouthwest(bb);
        ac.setSouth(bc);
        ac.setSoutheast(bd);
        ac.setEast(ad);
        
        ad.setWest(ac);
        ad.setSouthwest(bc);
        ad.setSouth(bd);
        ad.setSoutheast(be);
        ad.setEast(ae);
        
        ae.setWest(ad);
        ae.setSouthwest(bd);
        ae.setSouth(be);
        ae.setSoutheast(bf);
        ae.setEast(af);
        
        af.setWest(ae);
        af.setSouthwest(be);
        af.setSouth(bf);
        af.setSoutheast(bg);
        af.setEast(ag);
        
        ag.setWest(af);
        ag.setSouthwest(bf);
        ag.setSouth(bg);
        ag.setSoutheast(bh);
        ag.setEast(ah);
        
        // Conexiones de la parte inferior
        hb.setWest(ha);
        hb.setNorthwest(ga);
        hb.setNorth(gb);
        hb.setNortheast(gc);
        hb.setEast(hc);
        
        hc.setWest(hb);
        hc.setNorthwest(gb);
        hc.setNorth(gc);
        hc.setNortheast(gd);
        hc.setEast(hd);
        
        hd.setWest(hc);
        hd.setNorthwest(gc);
        hd.setNorth(gd);
        hd.setNortheast(ge);
        hd.setEast(he);
        
        he.setWest(hd);
        he.setNorthwest(gd);
        he.setNorth(ge);
        he.setNortheast(gf);
        he.setEast(hf);
        
        hf.setWest(he);
        hf.setNorthwest(ge);
        hf.setNorth(gf);
        hf.setNortheast(gg);
        hf.setEast(hg);
        
        hg.setWest(hf);
        hg.setNorthwest(gf);
        hg.setNorth(gg);
        hg.setNortheast(gh);
        hg.setEast(hh);
        
        // Conexiones de la parte izquierda
        ba.setNorth(aa);
        ba.setNortheast(ab);
        ba.setEast(bb);
        ba.setSoutheast(cb);
        ba.setSouth(ca);
        
        ca.setNorth(ba);
        ca.setNortheast(bb);
        ca.setEast(cb);
        ca.setSoutheast(db);
        ca.setSouth(da);
        
        da.setNorth(ca);
        da.setNortheast(cb);
        da.setEast(db);
        da.setSoutheast(eb);
        da.setSouth(ea);
        
        ea.setNorth(da);
        ea.setNortheast(db);
        ea.setEast(eb);
        ea.setSoutheast(fb);
        ea.setSouth(fa);
        
        fa.setNorth(ea);
        fa.setNortheast(eb);
        fa.setEast(fb);
        fa.setSoutheast(gb);
        fa.setSouth(ga);
        
        ga.setNorth(fa);
        ga.setNortheast(fb);
        ga.setEast(gb);
        ga.setSoutheast(hb);
        ga.setSouth(ha);
        
        // Conexiones de la parte derecha
        
        bh.setNorth(ah);
        bh.setNorthwest(ag);
        bh.setWest(bg);
        bh.setSouthwest(cg);
        bh.setSouth(ch);
        
        ch.setNorth(bh);
        ch.setNorthwest(bg);
        ch.setWest(cg);
        ch.setSouthwest(dg);
        ch.setSouth(dh);
        
        dh.setNorth(ch);
        dh.setNorthwest(cg);
        dh.setWest(dg);
        dh.setSouthwest(eg);
        dh.setSouth(eh);
        
        eh.setNorth(dh);
        eh.setNorthwest(dg);
        eh.setWest(eg);
        eh.setSouthwest(fg);
        eh.setSouth(fh);
        
        fh.setNorth(eh);
        fh.setNorthwest(eg);
        fh.setWest(fg);
        fh.setSouthwest(gg);
        fh.setSouth(gh);
        
        gh.setNorth(fh);
        gh.setNorthwest(fg);
        gh.setWest(gg);
        gh.setSouthwest(hg);
        gh.setSouth(hh);
        
        // Conexiones del centro
        
        bb.setNorthwest(aa);
        bb.setNorth(ab);
        bb.setNortheast(ac);
        bb.setWest(ba);
        bb.setEast(bc);
        bb.setSouthwest(ca);
        bb.setSouth(cb);
        bb.setSoutheast(cc);
        
        bc.setNorthwest(ab);
        bc.setNorth(ac);
        bc.setNortheast(ad);
        bc.setWest(bb);
        bc.setEast(bd);
        bc.setSouthwest(cb);
        bc.setSouth(cc);
        bc.setSoutheast(cd);
        
        bd.setNorthwest(ac);
        bd.setNorth(ad);
        bd.setNortheast(ae);
        bd.setWest(bc);
        bd.setEast(be);
        bd.setSouthwest(cc);
        bd.setSouth(cd);
        bd.setSoutheast(ce);
        
        be.setNorthwest(ad);
        be.setNorth(ae);
        be.setNortheast(af);
        be.setWest(bd);
        be.setEast(bf);
        be.setSouthwest(cd);
        be.setSouth(ce);
        be.setSoutheast(cd);
        
        bf.setNorthwest(ae);
        bf.setNorth(af);
        bf.setNortheast(ag);
        bf.setWest(be);
        bf.setEast(bg);
        bf.setSouthwest(ce);
        bf.setSouth(cf);
        bf.setSoutheast(cg);
        
        bg.setNorthwest(af);
        bg.setNorth(ag);
        bg.setNortheast(ah);
        bg.setWest(bf);
        bg.setEast(bh);
        bg.setSouthwest(cf);
        bg.setSouth(cg);
        bg.setSoutheast(ch);
        
        cb.setNorthwest(ba);
        cb.setNorth(bb);
        cb.setNortheast(bc);
        cb.setWest(ca);
        cb.setEast(cc);
        cb.setSouthwest(da);
        cb.setSouth(db);
        cb.setSoutheast(dc);
        
        cc.setNorthwest(bb);
        cc.setNorth(bc);
        cc.setNortheast(bd);
        cc.setWest(cb);
        cc.setEast(cd);
        cc.setSouthwest(db);
        cc.setSouth(dc);
        cc.setSoutheast(dd);
        
        cd.setNorthwest(bc);
        cd.setNorth(bd);
        cd.setNortheast(be);
        cd.setWest(cc);
        cd.setEast(ce);
        cd.setSouthwest(dc);
        cd.setSouth(dd);
        cd.setSoutheast(de);
        
        ce.setNorthwest(bd);
        ce.setNorth(be);
        ce.setNortheast(bf);
        ce.setWest(cd);
        ce.setEast(cf);
        ce.setSouthwest(dd);
        ce.setSouth(de);
        ce.setSoutheast(df);
        
        cf.setNorthwest(be);
        cf.setNorth(bf);
        cf.setNortheast(bg);
        cf.setWest(ce);
        cf.setEast(cg);
        cf.setSouthwest(de);
        cf.setSouth(df);
        cf.setSoutheast(dg);
        
        cg.setNorthwest(bf);
        cg.setNorth(bg);
        cg.setNortheast(bh);
        cg.setWest(cf);
        cg.setEast(ch);
        cg.setSouthwest(df);
        cg.setSouth(dg);
        cg.setSoutheast(dh);
        
        db.setNorthwest(ca);
        db.setNorth(cb);
        db.setNortheast(cc);
        db.setWest(da);
        db.setEast(dc);
        db.setSouthwest(ea);
        db.setSouth(eb);
        db.setSoutheast(ec);
        
        dc.setNorthwest(cb);
        dc.setNorth(cc);
        dc.setNortheast(cd);
        dc.setWest(db);
        dc.setEast(dd);
        dc.setSouthwest(eb);
        dc.setSouth(ec);
        dc.setSoutheast(ed);
        
        dd.setNorthwest(cc);
        dd.setNorth(cd);
        dd.setNortheast(ce);
        dd.setWest(dc);
        dd.setEast(de);
        dd.setSouthwest(ec);
        dd.setSouth(ed);
        dd.setSoutheast(ee);
        
        de.setNorthwest(cd);
        de.setNorth(ce);
        de.setNortheast(cf);
        de.setWest(dd);
        de.setEast(df);
        de.setSouthwest(ed);
        de.setSouth(ee);
        de.setSoutheast(ef);
        
        df.setNorthwest(ce);
        df.setNorth(cf);
        df.setNortheast(cg);
        df.setWest(de);
        df.setEast(dg);
        df.setSouthwest(ee);
        df.setSouth(ef);
        df.setSoutheast(eg);
        
        dg.setNorthwest(cf);
        dg.setNorth(cg);
        dg.setNortheast(ch);
        dg.setWest(df);
        dg.setEast(dh);
        dg.setSouthwest(ef);
        dg.setSouth(eg);
        dg.setSoutheast(eh);
        
        eb.setNorthwest(da);
        eb.setNorth(db);
        eb.setNortheast(dc);
        eb.setWest(ea);
        eb.setEast(ec);
        eb.setSouthwest(fa);
        eb.setSouth(fb);
        eb.setSoutheast(fc);
        
        ec.setNorthwest(db);
        ec.setNorth(dc);
        ec.setNortheast(dd);
        ec.setWest(eb);
        ec.setEast(ed);
        ec.setSouthwest(fb);
        ec.setSouth(fc);
        ec.setSoutheast(fd);
        
        ed.setNorthwest(dc);
        ed.setNorth(dd);
        ed.setNortheast(de);
        ed.setWest(ec);
        ed.setEast(ee);
        ed.setSouthwest(fc);
        ed.setSouth(fd);
        ed.setSoutheast(fe);
        
        ee.setNorthwest(dd);
        ee.setNorth(de);
        ee.setNortheast(df);
        ee.setWest(ed);
        ee.setEast(ef);
        ee.setSouthwest(fd);
        ee.setSouth(fe);
        ee.setSoutheast(ff);
        
        ef.setNorthwest(de);
        ef.setNorth(df);
        ef.setNortheast(dg);
        ef.setWest(ee);
        ef.setEast(eg);
        ef.setSouthwest(fe);
        ef.setSouth(ff);
        ef.setSoutheast(fg);
        
        eg.setNorthwest(df);
        eg.setNorth(dg);
        eg.setNortheast(dh);
        eg.setWest(ef);
        eg.setEast(eh);
        eg.setSouthwest(ff);
        eg.setSouth(fg);
        eg.setSoutheast(fh);
        
        fb.setNorthwest(ea);
        fb.setNorth(eb);
        fb.setNortheast(ec);
        fb.setWest(fa);
        fb.setEast(fc);
        fb.setSouthwest(ga);
        fb.setSouth(gb);
        fb.setSoutheast(gc);
        
        fc.setNorthwest(eb);
        fc.setNorth(ec);
        fc.setNortheast(ed);
        fc.setWest(fb);
        fc.setEast(fd);
        fc.setSouthwest(gb);
        fc.setSouth(gc);
        fc.setSoutheast(gd);
        
        fd.setNorthwest(ec);
        fd.setNorth(ed);
        fd.setNortheast(ee);
        fd.setWest(fc);
        fd.setEast(fe);
        fd.setSouthwest(gc);
        fd.setSouth(gd);
        fd.setSoutheast(ge);
        
        fe.setNorthwest(ed);
        fe.setNorth(ee);
        fe.setNortheast(ef);
        fe.setWest(fd);
        fe.setEast(ff);
        fe.setSouthwest(gd);
        fe.setSouth(ge);
        fe.setSoutheast(gf);
        
        ff.setNorthwest(ee);
        ff.setNorth(ef);
        ff.setNortheast(eg);
        ff.setWest(fe);
        ff.setEast(fg);
        ff.setSouthwest(ge);
        ff.setSouth(gf);
        ff.setSoutheast(gg);
        
        fg.setNorthwest(ef);
        fg.setNorth(eg);
        fg.setNortheast(eh);
        fg.setWest(ff);
        fg.setEast(fh);
        fg.setSouthwest(gf);
        fg.setSouth(gg);
        fg.setSoutheast(gh);
        
        gb.setNorthwest(fa);
        gb.setNorth(fb);
        gb.setNortheast(fc);
        gb.setWest(ga);
        gb.setEast(gc);
        gb.setSouthwest(ha);
        gb.setSouth(hb);
        gb.setSoutheast(hc);
        
        gc.setNorthwest(fb);
        gc.setNorth(fc);
        gc.setNortheast(fd);
        gc.setWest(gb);
        gc.setEast(gd);
        gc.setSouthwest(hb);
        gc.setSouth(hc);
        gc.setSoutheast(hd);
        
        gd.setNorthwest(fc);
        gd.setNorth(fd);
        gd.setNortheast(fe);
        gd.setWest(gc);
        gd.setEast(ge);
        gd.setSouthwest(hc);
        gd.setSouth(hd);
        gd.setSoutheast(he);
        
        ge.setNorthwest(fd);
        ge.setNorth(fe);
        ge.setNortheast(ff);
        ge.setWest(gd);
        ge.setEast(gf);
        ge.setSouthwest(hd);
        ge.setSouth(he);
        ge.setSoutheast(hf);
        
        gf.setNorthwest(fe);
        gf.setNorth(ff);
        gf.setNortheast(fg);
        gf.setWest(ge);
        gf.setEast(gg);
        gf.setSouthwest(he);
        gf.setSouth(hf);
        gf.setSoutheast(hg);
        
        gg.setNorthwest(ff);
        gg.setNorth(fg);
        gg.setNortheast(fh);
        gg.setWest(gf);
        gg.setEast(gh);
        gg.setSouthwest(hf);
        gg.setSouth(hg);
        gg.setSoutheast(hh);
    }
    
    
}
