/*
 * BTree.h
 */

#ifndef BTREE_H_
#define BTREE_H_

#include <iostream>
#include <vector>

using namespace std;

struct Node {
    typedef Node* NodePtr;
    int n;
    int* key;
    NodePtr* c;
    bool leaf;

    Node(const int t) {
        key = new int[2 * t - 1];
        c = new NodePtr[2 * t];
        leaf = true;
        n = 0;
    }

    ~Node() {
        if (!leaf)
            for (int i = 0; i < n; i++)
                delete c[i];
        delete[] c;
    }

    /**
     * find the min key in this node
     */
    int min() { return leaf ? key[0] : c[0]->min(); }

    /**
     * find the max key in this node
     */
    int max() { return leaf ? key[n - 1] : c[n]->max(); }

    void createList(Node* x, vector<int>& vec) {
        for (int i = 0; i < x->n; i++) {
            if (!x->leaf) {
                createList((x->c)[i], vec);
            }
            vec.push_back((x->key)[i]);
        }
        if (!x->leaf) {
            createList((x->c)[x->n], vec);
        }
    }



    /**
     * find the successor of key k in this node
    */
    void successor(int k) {
        vector<int> vec;
        createList(this, vec);
        for (auto i : vec) {
            if (i > k)
            {
                cout << i;
                break;
            }
        }

    }
    /**
     * find the predecessor of key k in this node
    */
    void predecessor(int k) {
        vector<int> vec;
        createList(this, vec);

        int lv = 0;
        for (auto i : vec) {
            if (i == k) {
                cout << lv;
                break;
            }
            lv = i;
        }


    }
};

class BTree {
    int t; // the branching factor
public:
    Node* root;
    // constructor: will be used instead of create()
    BTree(int);
    ~BTree();
    Node* allocateNode();
    Node* search(Node* x, int key);
    void insert(int key);
    void insertNonfull(Node* x, int k);
    void del(int key);
    void showTree();
    void diskRead(Node*);
    void diskWrite(Node*);
    void splitChild(Node*, int, Node*);
    void display(Node*, int);
    void inorderDisplay(Node*);
    void indentedDisplay();
};

#endif /* BTREE_H_ */
#endif /* BTREE_H_ */
