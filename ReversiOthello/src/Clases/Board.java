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
  
    int nQuantity, bQuantity;

    public Board() {
        boardInitializer();
        setDirections();
        this.nQuantity = 0;
        this.bQuantity = 0;
    }

    public int getnQuantity() {
        return nQuantity;
    }

    public void setnQuantity(int nQuantity) {
        this.nQuantity = nQuantity;
    }

    public int getbQuantity() {
        return bQuantity;
    }

    public void setbQuantity(int bQuantity) {
        this.bQuantity = bQuantity;
    }

    
    
    public Node getFirst() {
        return aa;
    }    
    
    // Se inicializan los nodos con todas sus direcciones en nulo
    public void boardInitializer() {
    
        aa = new Node('_');
        ab = new Node('_');
        ac = new Node('_'); 
        ad = new Node('_'); 
        ae = new Node('_');
        af = new Node('_');
        ag = new Node('_');
        ah = new Node('_');
        
        ba = new Node('_');
        bb = new Node('_');
        bc = new Node('_');
        bd = new Node('_');
        be = new Node('_');
        bf = new Node('_');
        bg = new Node('_');
        bh = new Node('_');
        
        ca = new Node('_');
        cb = new Node('_');
        cc = new Node('_');
        cd = new Node('_');
        ce = new Node('_');
        cf = new Node('_');
        cg = new Node('_');
        ch = new Node('_');
        
        da = new Node('_');
        db = new Node('_');
        dc = new Node('_');
        dd = new Node('B');
        de = new Node('N');
        df = new Node('_');
        dg = new Node('_');
        dh = new Node('_');
        
        ea = new Node('_');
        eb = new Node('_');
        ec = new Node('_');
        ed = new Node('N');
        ee = new Node('B');
        ef = new Node('_');
        eg = new Node('_');
        eh = new Node('_');
        
        fa = new Node('_');
        fb = new Node('_');
        fc = new Node('_');
        fd = new Node('_');
        fe = new Node('_');
        ff = new Node('_');
        fg = new Node('_');
        fh = new Node('_');
        
        ga = new Node('_');
        gb = new Node('_');
        gc = new Node('_');
        gd = new Node('_');
        ge = new Node('_');
        gf = new Node('_');
        gg = new Node('_');
        gh = new Node('_');
        
        ha = new Node('_');
        hb = new Node('_');
        hc = new Node('_');
        hd = new Node('_');
        he = new Node('_');
        hf = new Node('_');
        hg = new Node('_');
        hh = new Node('_');
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
        be.setSoutheast(cf);
        
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
    
    public void tokenCounter(){ 
 
        Node first = aa;
        while (first != null) {
            Node aux = first; 
            while (aux != null) {
               if(aux.getToken().getState()== 'N'){
                nQuantity++;
               }else if(aux.getToken().getState()== 'B'){
                bQuantity++;  
            }
                aux = aux.getEast(); 
            }
            first = first.getSouth(); 
        }
     }
    
    /* Los siguientes métodos booleanos retornan verdadero si hay una jugada válida
    o encierro (para cada una de las direcciones)*/
    public boolean eastTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getEast()!= null &&
               aux.getEast().getToken().getState() == enemyColor) {
            aux = aux.getEast();
        }

        return aux.getEast() != null &&
               aux.getEast().getToken().getState() == myColor;
    }
    
    public boolean westTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getWest()!= null &&
               aux.getWest().getToken().getState() == enemyColor) {
            aux = aux.getWest();
        }

        return aux.getWest() != null &&
               aux.getWest().getToken().getState() == myColor;
    }
    
    public boolean northTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getNorth()!= null &&
               aux.getNorth().getToken().getState() == enemyColor) {
            aux = aux.getNorth();
        }

        return aux.getNorth() != null &&
               aux.getNorth().getToken().getState() == myColor;
    }
    
    public boolean southTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getSouth()!= null &&
               aux.getSouth().getToken().getState() == enemyColor) {
            aux = aux.getSouth();
        }

        return aux.getSouth() != null &&
               aux.getSouth().getToken().getState() == myColor;
    }
    
    public boolean northeastTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getNortheast()!= null &&
               aux.getNortheast().getToken().getState() == enemyColor) {
            aux = aux.getNortheast();
        }

        return aux.getNortheast() != null &&
               aux.getNortheast().getToken().getState() == myColor;
    }
    
    public boolean northwestTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getNorthwest()!= null &&
               aux.getNorthwest().getToken().getState() == enemyColor) {
            aux = aux.getNorthwest();
        }

        return aux.getNorthwest() != null &&
               aux.getNorthwest().getToken().getState() == myColor;
    }
    
    public boolean southeastTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getSoutheast()!= null &&
               aux.getSoutheast().getToken().getState() == enemyColor) {
            aux = aux.getSoutheast();
        }

        return aux.getSoutheast() != null &&
               aux.getSoutheast().getToken().getState() == myColor;
    }
    
    public boolean southwestTraversal(Node node, char myColor, char enemyColor) {
        Node aux = node;

        while (aux.getSouthwest() != null &&
               aux.getSouthwest().getToken().getState() == enemyColor) {
            aux = aux.getSouthwest();
        }

        return aux.getSouthwest() != null &&
               aux.getSouthwest().getToken().getState() == myColor;
    }
    
    // Localiza celdas (Nodos) válidos para una jugada y los marca con un carácter
    public void locateValidCell(Player player, CharacterList list) {
        Node first = aa;
        Node aux = first;
        CharacterNode auxNode;

        char myColor = ' ';
        char enemyColor = ' ';

        // Determina el color de las fichas del jugador actual
        if (player.getColor().getState() == 'N') {
            myColor = 'N';
            enemyColor = 'B';
        } else if(player.getColor().getState() == 'N') { 
            myColor = 'B';
            enemyColor = 'N';
        }

        while (aux != null) {

            // Tiene que estar parado en una celda vacía
            if (aux.getToken().getState() == '_') {
                boolean isValidCell = false;

                /* Pregunta hacia una dirección en específico si la siguiente es el borde, 
                si es una ficha enemiga y si termina en jugada válida*/
                
                if (aux.getNorth() != null &&
                    aux.getNorth().getToken().getState() == enemyColor &&
                    northTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getSouth() != null &&
                    aux.getSouth().getToken().getState() == enemyColor &&
                    southTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getEast() != null &&
                    aux.getEast().getToken().getState() == enemyColor &&
                    eastTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getWest() != null &&
                    aux.getWest().getToken().getState() == enemyColor &&
                    westTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getNortheast() != null &&
                    aux.getNortheast().getToken().getState() == enemyColor &&
                    northeastTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getNorthwest() != null &&
                    aux.getNorthwest().getToken().getState() == enemyColor &&
                    northwestTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getSoutheast() != null &&
                    aux.getSoutheast().getToken().getState() == enemyColor &&
                    southeastTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                if (aux.getSouthwest() != null &&
                    aux.getSouthwest().getToken().getState() == enemyColor &&
                    southwestTraversal(aux, myColor, enemyColor)) {
                    isValidCell = true;
                }

                // Si al menos en una dirección hay jugada válida, marca esa celda con un caracter
                if (isValidCell) {
                    auxNode = list.getHead();
                    while (auxNode != null && auxNode.isUsed()) {
                        auxNode = auxNode.getNext();
                    }
                    if (auxNode != null) {
                        aux.getToken().setState(auxNode.getCharacter());
                        auxNode.setIsUsed(true);
                    }
                }
            }

            aux = aux.getEast();
            if (aux == null) {
                first = first.getSouth();
                aux = first;
            }
        }
    }
    
    public void showBoard() {
        Node first = aa;
        Node aux = first;

        while (first != null) {
            aux = first;

            while (aux != null) {
                System.out.print(aux.getToken().getState() + " ");
                aux = aux.getEast();
            }

            System.out.println(); // salto de línea al final de la fila
            first = first.getSouth();
        }
    }
    
    
    public void encloseDetector(Player player, Node node) {

        char myColor = ' ';
        char enemyColor = ' ';

        // Determina el color de las fichas del jugador actual
        if (player.getColor().getState() == 'N') {
            myColor = 'N';
            enemyColor = 'B';
        } else if (player.getColor().getState() == 'B') {
            myColor = 'B';
            enemyColor = 'N';
        }

        boolean isNorthEnclose = false;
        boolean isSouthEnclose = false;
        boolean isEastEnclose = false;
        boolean isWestEnclose = false;
        boolean isNortheastEnclose = false;
        boolean isNorthwestEnclose = false;
        boolean isSoutheastEnclose = false;
        boolean isSouthwestEnclose = false;

        /* Pregunta hacia una dirección en específico si no es un borde, si es una ficha 
        enemiga y si termina encierro (Para todas las direcciones)*/
        
        if (node.getNorth() != null &&
            node.getNorth().getToken().getState() == enemyColor &&
            northTraversal(node, myColor, enemyColor)) {
            isNorthEnclose = true;
        }

        if (node.getSouth() != null &&
            node.getSouth().getToken().getState() == enemyColor &&
            southTraversal(node, myColor, enemyColor)) {
            isSouthEnclose = true;
        }

        if (node.getEast() != null &&
            node.getEast().getToken().getState() == enemyColor &&
            eastTraversal(node, myColor, enemyColor)) {
            isEastEnclose = true;
        }

        if (node.getWest() != null &&
            node.getWest().getToken().getState() == enemyColor &&
            westTraversal(node, myColor, enemyColor)) {
            isWestEnclose = true;
        }

        if (node.getNortheast() != null &&
            node.getNortheast().getToken().getState() == enemyColor &&
            northeastTraversal(node, myColor, enemyColor)) {
            isNortheastEnclose = true;
        }

        if (node.getNorthwest() != null &&
            node.getNorthwest().getToken().getState() == enemyColor &&
            northwestTraversal(node, myColor, enemyColor)) {
            isNorthwestEnclose = true;
        }

        if (node.getSoutheast() != null &&
            node.getSoutheast().getToken().getState() == enemyColor &&
            southeastTraversal(node, myColor, enemyColor)) {
            isSoutheastEnclose = true;
        }

        if (node.getSouthwest() != null &&
            node.getSouthwest().getToken().getState() == enemyColor &&
            southwestTraversal(node, myColor, enemyColor)) {
            isSouthwestEnclose = true;
        }

        // Llama a la función encargada de voltear las fichas que están dentro de un encierro
        flipTokens(
            isNorthEnclose, isSouthEnclose, isEastEnclose, isWestEnclose,
            isNortheastEnclose, isNorthwestEnclose,
            isSoutheastEnclose, isSouthwestEnclose,
            node, myColor, enemyColor
        );
    }
    
    public void flipTokens(boolean north, boolean south, boolean east,
        boolean west, boolean northeast, boolean northwest,
        boolean southeast, boolean southwest,
        Node node, char myColor, char enemyColor) {

        Node aux;

        if (north) {
            aux = node.getNorth();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNorth();
            }
        }

        if (south) {
            aux = node.getSouth();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSouth();
            }
        }

        if (east) {
            aux = node.getEast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getEast();
            }
        }

        if (west) {
            aux = node.getWest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getWest();
            }
        }

        if (northeast) {
            aux = node.getNortheast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNortheast();
            }
        }

        if (northwest) {
            aux = node.getNorthwest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getNorthwest();
            }
        }

        if (southeast) {
            aux = node.getSoutheast();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSoutheast();
            }
        }

        if (southwest) {
            aux = node.getSouthwest();
            while (aux.getToken().getState() == enemyColor) {
                aux.getToken().setState(myColor);
                aux = aux.getSouthwest();
            }
        }
    }

    
    // Busca la casilla con el carácter ingresado por el usuario y la pinta del color del jugador
    public Node searchNodeByChar(char c) {
        Node currentRow = aa; 

        while (currentRow != null) {
            Node aux = currentRow;
            while (aux != null) {
                if (aux.getToken().getState() == c) {
                    return aux;
                }
                aux = aux.getEast();
            }
            currentRow = currentRow.getSouth();
        }
        return null;
    }
    
    // Inserta una ficha en el tablero
    public void putToken(Node node, Player player) {
        if (node == null) System.out.println("Posicion invalida");
        
        node.getToken().setState(player.getColor().getState());
        
        // Una vez insertada la ficha, se procede a voltera las que quedaron en encierro
        encloseDetector(player, node);
    }

    
}
