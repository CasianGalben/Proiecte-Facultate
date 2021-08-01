
#ifndef NODE_H_
#define NODE_H_

#include <string>
#include <iostream>
#include <sstream>

using namespace std;

struct Node {
	int key;       // key
	Node *p;     // pointer to parent
	Node *left;  // pointer to left child
	Node *right; // pointer to right child

	Node(int k, Node *l = 0, Node *r = 0, Node *parent = 0) :
		key(k), p(parent), left(l), right(r) { }

	string toString() {
		ostringstream os;
		os << key;
		return os.str();
	}

	~Node() {
		delete left;
		delete right;
	}
};

struct BSTree {
	Node* root;

	/* Default constructor: creates an empty tree */
	BSTree() { root = 0; }

	~BSTree() { delete root; }

	Node* createNode(int key) { return new Node(key); }

	/**
	 * return the node with key k from this tree, and null
	 * if no such node exists
	 */
	Node* search(int k) {
		return search(root, k);
	}

	Node* search(Node* w, int key) {
		if (w == 0 || w->key == key)
			return w;
		return search( (key < w->key) ? w->left : w->right, key);
	}

	Node* maximum(Node* w) {
		// TODO
		return 0;
	}

	Node* minimum(Node* w) {
		Node* x = w;
		while (x->left != 0)
			x = x->left;
		return x;
	}

	/**
	 * return a pointer to the successor of node w in
	 * this binary search tree
	 */
	Node* successor(Node* w) {
		Node* x = w;
		if (x->right != 0) return minimum(x->right);
		if (x->p == 0)
			return 0; // x has no successor
		Node* y = x->p;
		while (y != 0 && x == y->right) {
			x = y;
			y = y->p;
		}
		return y;
	}

	/**
	 * return a pointer to the predecessor of node w in
	 * this binary search tree
	 */
	Node* predecessor(Node* w) {
		// TODO
		return 0;
	}

	/*
	 * Insert node z at the right place in the binary search tree
	 */
	void insert(Node* z) {
		Node *y = 0;
		Node *x = root;
		while (x != 0) {
			y = x;
			x = (z->key < x->key) ? x->left : x->right;
		}
		z->p = y;
		if (y == 0)
			root = z;
		else if (z->key < y->key)
			y->left = z;
		else
			y->right = z;
	}

	/**
	 * Removes node z from this tree
	 */
	Node* del(Node* z) {
		Node *y = (z->left == 0 || z->right == 0) ? z : successor(z);
		Node *x = (y->left != 0) ? y->left : y->right;
		if (x != 0) {
			x->p = y->p;
			y->p = 0;
			root = x;
		} else if (y == y->p->left)
			y->p->left = x;
		else
			y->p->right = z;
		if (y != z) {
			z->key = y->key;
		}
		return y;
	}

	/**
	 * This method performs the traversal in inorder
	 * of the nodes of a binary tree.
	 */
	void inorder(Node* T) {
		if (T != 0) {
			inorder(T->left);
			cout << T->toString() << ' ';
			inorder(T->right);
		}
	}

	void inorder() { inorder(root); }

	/**
	 * Auxiliary method to display the content of a binary tree
	 * in an indented way.
	 */
	void display(Node* w, int indent) {
		if (w != 0) {
			display(w->right, indent + 2);
			for (int i = 0; i < indent; i++) cout << ' ';
			cout << w->toString() << '\n';
			display(w->left, indent + 2);
		}
	}

	void indentedDisplay() {
		cout << "The binary search tree is" <<endl;
		display(root, 0);
	}

	int depth() {
		return depth(root);
	}

	int depth(Node* n) {
                // TODO
		return 0;
	}
};

#endif /* NODE_H_ */
